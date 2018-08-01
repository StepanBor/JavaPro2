package com.gmail.stepan1983.Controllers;


import com.gmail.stepan1983.dao.ServiceArch;
import com.gmail.stepan1983.model.Archive;
import org.springframework.beans.factory.annotation.Autowired;
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

        File temp=new File(fileToAdd.getName());

        try(FileOutputStream fos=new FileOutputStream(temp)){

            fos.write(fileToAdd.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Archive arch=new Archive(temp);

        serviceArch.addArch(arch);

        List<Archive> arcnList=serviceArch.getArchList();
        model.addAttribute("archList", arcnList);
        return "index";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteArch(Model model, @RequestParam Long[] id){

        serviceArch.remuveArch(id);

        List<Archive> arcnList=serviceArch.getArchList();
        model.addAttribute("archList", arcnList);
        return "index";

    }



}
