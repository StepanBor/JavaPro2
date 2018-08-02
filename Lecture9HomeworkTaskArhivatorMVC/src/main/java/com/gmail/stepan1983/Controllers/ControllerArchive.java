package com.gmail.stepan1983.Controllers;


import com.gmail.stepan1983.dao.ServiceArch;
import com.gmail.stepan1983.model.Archive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Controller
public class ControllerArchive {

    @Autowired
    ServiceArch serviceArch;

    @RequestMapping("/")
    public String index(Model model){

        List<Archive> arcnList=serviceArch.getArchList();
        model.addAttribute("archList", arcnList);
        return "index";

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public  String addArch(Model model, @RequestParam MultipartFile fileToAdd){

        File temp=new File(fileToAdd.getOriginalFilename());

        try(FileOutputStream fos=new FileOutputStream(temp)){

            fos.write(fileToAdd.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(temp.getName());
        Archive arch=new Archive(temp);
        System.out.println(arch+"from controller");
        serviceArch.addArch(arch);

        List<Archive> arcnList=serviceArch.getArchList();
        model.addAttribute("archList", arcnList);
        return "index";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteArch(Model model, @RequestParam("delete[]") Long[] id){

        System.out.println(id+"from controller");
        serviceArch.remuveArch(id);

        List<Archive> arcnList=serviceArch.getArchList();
        model.addAttribute("archList", arcnList);
        return "index";

    }

    @RequestMapping(value = "/getArch")
    public ResponseEntity<byte[]> getArchById(@RequestParam("id") Long id){


        byte[] bytes=null;
        File arch=serviceArch.getArch(id);
        try {
           bytes=Files.readAllBytes(arch.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpHeaders headers = new HttpHeaders();

//        headers.set(HttpHeaders.CONTENT_TYPE, "application/zip");
//        headers.set(HttpHeaders.CONTENT_DISPOSITION,
//                "attachment; filename=" + arch.getName());
//        MediaType mediaType=new MediaType();
//
        headers.setContentType(MediaType.parseMediaType("application/zip"));
        headers.set(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=" + arch.getName());
        ResponseEntity<byte[]> responseEntity= new ResponseEntity<byte[]>(bytes,headers,HttpStatus.OK);
        return responseEntity;
    }

}
