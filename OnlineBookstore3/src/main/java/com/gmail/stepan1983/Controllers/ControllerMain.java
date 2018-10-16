package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.DTO.ClientDTO;
import com.gmail.stepan1983.Service.BookService;
import com.gmail.stepan1983.Service.ClientGroupService;
import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.Service.OrderService;
import com.gmail.stepan1983.config.ConsoleColors;
import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import com.gmail.stepan1983.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerMain {

    //    private static final int ITEMS_PER_PAGE = 6;
    private static boolean sortDirection;

    @Autowired
    ClientService clientService;

    @Autowired
    OrderService orderService;

    @Autowired
    ClientGroupService clientGroupService;

    @Autowired
    BookService bookService;

//    @RequestMapping("/")
//    public String indexPage() {
//        return "index";
//    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/photo/{photoId}")
    public ResponseEntity<byte[]> getPhotoBytes(@PathVariable("photoId") long id) {


        Client client = clientService.getById(id);
        File file = client.getAvatar();
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

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

//        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
        return new ResponseEntity<>(bytes, HttpStatus.OK);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/cover/{coverId}")
    public ResponseEntity<byte[]> getCoverBytes(@PathVariable("coverId") long id) {


        BookItem bookItem =bookService.getById(id);
        File file = bookItem.getCover();
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

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<>(bytes, HttpStatus.OK);

    }




    @RequestMapping(value = "/createAccaunt")
    public String createAccaunt() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createClient(Model model,
                               @RequestParam(required = false, value = "login") String login,
                               @RequestParam(required = false) String password,
                               @RequestParam(required = false) String email,
                               @RequestParam(required = false) String phone,
                               @RequestParam(required = false) String adress,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) String lastname,
                               @RequestParam(required = false) MultipartFile multipartFile)
            throws MaxUploadSizeExceededException {

        if (login != null) {

            File avatar = null;

            if (multipartFile != null) {

                avatar = new File(multipartFile.getOriginalFilename());
                try (FileOutputStream fos = new FileOutputStream(avatar)) {

                    fos.write(multipartFile.getBytes());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!clientService.existsByLogin(login)) {


                Client client = new Client(login, password, email, phone, adress, name, lastname, UserRole.CUSTOMER, null, avatar);

                clientService.addClient(client);

                return "login";
            }
        }
        String wrongLogin = "Wrong login";
        model.addAttribute("wrongLofin", wrongLogin);
        return "register";
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String handleSizeExceededException(Model model, Exception ex) {

        String maxxSizeExceeded = "file size must be less than 10Mb";

        model.addAttribute("MaxUploadSizeExceededException", maxxSizeExceeded);
        return "register";
    }


//    @RequestMapping("/adminPage")
    public List<ClientDTO> adminPage(Model model,@RequestParam(required = false, defaultValue = "0") Integer page,
                                     @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage,
                                     @RequestParam(required = false) Long clientId,
                                     @RequestParam(required = false, defaultValue = "0") Long pageOrders,
                                     @RequestParam(required = false, defaultValue = "id") String sortBy,
                                     @RequestParam(required = false, defaultValue = "0") Integer changeSortDirect) {


        if (changeSortDirect == 1) {
            sortDirection = !sortDirection;
        }

        long clientNum = clientService.count();

        long clientPageNum = clientNum % itemsPerPage == 0
                ? clientNum / itemsPerPage : clientNum / itemsPerPage + 1;

        List<Client> clients = clientService.findAll(page, itemsPerPage, sortBy, sortDirection);


        List<ClientDTO> clientDTOS=new ArrayList<>();

        for (Client client : clients) {
            clientDTOS.add(client.toDTO());
        }

        long clientDetailsId = (clientId == null) ? clients.get(0).getId() : clientId;

        Client client = clientService.getById(clientDetailsId);

        List<Order> orders = orderService.findByClient(client, PageRequest.of(pageOrders.intValue(), itemsPerPage,
                Sort.Direction.ASC, "status", "orderPrice"));

        model.addAttribute("clients", clients);
        model.addAttribute("clientsPagesNum", clientPageNum);
        model.addAttribute("page", page);
        model.addAttribute("clientDetails", client);
        model.addAttribute("orders", orders);
        model.addAttribute("sortBy", sortBy);
        return clientDTOS;
    }
}
