package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ControllerMain {

    @Autowired
    ClientService clientService;

    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/admin")
    public String adminPage(Model model){

        Page<Client> clients= clientService.findAll(PageRequest.of(0,6));

        model.addAttribute("clients",clients);

        return "admin";
    }
}
