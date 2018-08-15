package com.gmail.stepan1983.controllers;

import com.gmail.stepan1983.Services.ContactService;
import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ContactController {

    private static final int ITEMS_PER_PAGE = 6;

    @Autowired
    ContactService contactService;

    @RequestMapping("/")
    public String index(Model model, @RequestParam(required = false) int page) {
        long totalContNum = contactService.count();
        long pageNum = totalContNum % ITEMS_PER_PAGE == 0
                ? totalContNum / ITEMS_PER_PAGE : totalContNum / ITEMS_PER_PAGE + 1;
        List<GroupContact> groups=contactService.listGroups();
        List<Contact> contacts = contactService.listContacts(null, ((page == 1 | page == 0) ? 1 : page * ITEMS_PER_PAGE), ITEMS_PER_PAGE);
        model.addAttribute("contactList", contacts);
        model.addAttribute("groups",groups);
        model.addAttribute("pageNum", pageNum);
        return "myIndex";
    }

    @RequestMapping("/addContact")
    public String addContact(Model model, @RequestParam Contact contact){
        return "myIndex";
    }


}
