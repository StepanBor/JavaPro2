package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ControllerMain {

    private static final int ITEMS_PER_PAGE = 6;

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
    public String adminPage(Model model, @RequestParam(required = false, defaultValue="0") Integer page){

        long clientNum=clientService.count();

        long clientPageNum = clientNum % ITEMS_PER_PAGE == 0
                ? clientNum / ITEMS_PER_PAGE : clientNum / ITEMS_PER_PAGE + 1;



        Page<Client> clients= clientService.findAll(PageRequest.of(page,ITEMS_PER_PAGE));

        model.addAttribute("clients",clients);
        model.addAttribute("clientsPagesNum",clientPageNum);
        model.addAttribute("page",page);
        return "admin";
    }
}
