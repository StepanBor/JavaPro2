package com.gmail.stepan1983.controllers;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Photo;
import com.gmail.stepan1983.service.ClientService;
import com.gmail.stepan1983.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.*;
import java.util.List;

@Controller
public class ControllerMain {

    private static boolean sortDirection;

    @Autowired
    ClientService clientService;

    @Autowired
    PhotoService photoService;

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/clientPage")
    public String adminPage(Model model, @RequestParam(required = false, defaultValue = "0") Integer page,
                            @RequestParam(required = false, defaultValue = "10") Integer itemsPerPage,
                            @RequestParam(required = false) Long photoId,
                            @RequestParam(required = false, defaultValue = "0") Long pageOrders,
                            @RequestParam(required = false, defaultValue="id")String sortBy,
                            @RequestParam(required = false, defaultValue = "0")Integer changeSortDirect) {



        if(changeSortDirect==1){
            sortDirection=!sortDirection;
        }

        long photoNum = photoService.count();

        long photoPageNum = photoNum % itemsPerPage == 0
                ? photoNum / itemsPerPage : photoNum / itemsPerPage + 1;

//        List<Client> clients = clientService.findAll(PageRequest.of(page, itemsPerPage));
        List<Photo> photos = photoService.findAll(page, itemsPerPage, sortBy, sortDirection);

        long photoDetailsId = (photoId == null) ? photos.get(0).getId() : photoId;

        Client clientDetails = photoService.findFotoById(photoDetailsId).getClient();



        model.addAttribute("photos", photos);
        model.addAttribute("photoPagesNum", photoPageNum);
        model.addAttribute("page", page);
        model.addAttribute("clientDetails", clientDetails);
        model.addAttribute("sortBy",sortBy);
        model.addAttribute("photoId",photoId);
        return "clientPage";
    }

    @RequestMapping("/photo/{photoId}")
    public ResponseEntity<byte[]> getPhotoBytes(@PathVariable("photoId") long id) {


        Photo photo = photoService.findFotoById(id);
        File file = photo.getFoto();
        byte[] bytes = getBytesFromFile(file);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);

    }
    @RequestMapping("/avatar/{photoId}")
    public ResponseEntity<byte[]> getAvatarBytes(@PathVariable("photoId") long id) {

        Client client = clientService.getById(id);
        File file = client.getAvatar();
        byte[] bytes = getBytesFromFile(file);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);

    }

    public byte[] getBytesFromFile(File file){
        byte[] bytes = null;
        byte[] buffer = new byte[(int) file.length()];
        try (InputStream in = new FileInputStream(file); ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            int read = 0;
            while ((read = in.read(buffer)) > 0) {
                baos.write(buffer, 0, read);
            }
            bytes = baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
