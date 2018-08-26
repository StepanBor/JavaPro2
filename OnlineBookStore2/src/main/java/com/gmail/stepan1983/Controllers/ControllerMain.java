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

//    private static final int ITEMS_PER_PAGE = 6;

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

    @RequestMapping("/adminPage")
    public String adminPage(Model model, @RequestParam(required = false, defaultValue="0") Integer page,
                            @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage){

        long clientNum=clientService.count();

        long clientPageNum = clientNum % itemsPerPage == 0
                ? clientNum / itemsPerPage : clientNum / itemsPerPage + 1;



        Page<Client> clients= clientService.findAll(PageRequest.of(page,itemsPerPage));

        model.addAttribute("clients",clients);
        model.addAttribute("clientsPagesNum",clientPageNum);
        model.addAttribute("page",page);
//        return "admin";
        return "adminPage";
    }
}
