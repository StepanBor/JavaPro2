package com.gmail.stepan1983.config;

import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.Service.ClientServiceImpl;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;

@Component
public class TestDataBean {
    @Autowired
    private ClientService clientService;

    @PostConstruct
    public void fillData() {
        ShaPasswordEncoder encoder=new ShaPasswordEncoder();

        Client client=new Client("test1",encoder.encodePassword("Password",null),"email1@com",
                "phone1","Adress1","name1","lastname1",UserRole.CUSTOMER,null);
        Client client2=new Client("admin",encoder.encodePassword("Password",null),"email2@com",
                "phone2","Adress2","name2","lastname2",UserRole.ADMIN,null);

        clientService.addClient(client);
        clientService.addClient(client2);

        Client[] clients=new Client[20];
        for (int i = 0; i < 19; i++) {

            clients[i]=new Client("login"+i,encoder.encodePassword("Password"+i,null),"email"+i+"@com",
                    "phone"+i,"Adress"+i,"name"+i,"lastname"+i,UserRole.CUSTOMER,null);
            clientService.addClient(clients[i]);

        }


    }
}
