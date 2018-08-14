package com.gmail.stepan1983.config;

import com.gmail.stepan1983.Services.ContactService;
import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PreStartInit {

    @Autowired
    ContactService contactService;

    @PostConstruct
    public void createData(){

        GroupContact groupContact=new GroupContact("TestGroup",null);

        contactService.addGroup(groupContact);

        for (int i = 0; i < 25; i++) {

            Contact c=new Contact("Name"+i,"Lastname"+i,"Name"+i+"@mail.com",groupContact);

            contactService.addContact(c);

        }

        for (int i = 0; i < 25; i++) {
            Contact c=new Contact("Name2"+i,"Lastname2"+i,"Name2"+i+"@mail.com",null);
            contactService.addContact(c);
        }

    }



}
