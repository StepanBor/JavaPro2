package com.gmail.stepan1983.config;

import com.gmail.stepan1983.model.Photo;
import com.gmail.stepan1983.service.ClientService;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.UserRole;
import com.gmail.stepan1983.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Transactional
public class TestDataBean {
    @Autowired
    private ClientService clientService;

    @Autowired
    private PhotoService photoService;


    public TestDataBean() {
    }

    @PostConstruct
    @Transactional
    public void fillData() {
        /* get avatars*/
        List<File> avatars = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
//            File file=new File( "C:\\Users\\HOME\\Documents\\git\\JavaPro3\\JavaPro2\\FotoSharingService2\\src\\main\\webapp\\static\\images\\avatar-"+i+".jpg");
            File file=new File( "C:\\Users\\borysenko\\Documents\\GitHub\\JavaPro\\JavaPro\\FotoSharingService2\\src\\main\\webapp\\static\\images\\avatar-"+i+".jpg");

            avatars.add(file);
//            System.out.println(file.exists()+"WWWWWWWWWWWWWWW");
//            System.out.println(file.getPath()+"DDDDDDDDDDD");
        }

        ShaPasswordEncoder encoder = new ShaPasswordEncoder();
        File image = new File("C:\\Users\\HOME\\Documents\\git\\JavaPro3\\JavaPro2\\OnlineBookStore2\\src\\main\\webapp\\static\\images\\12274312_1719690841584330_6387016554043425967_n.jpg");


        Client client1 = new Client("test1", encoder.encodePassword("Password", null), "email1@com",
                "name1", UserRole.CLIENT, avatars.get(0),new ArrayList<Photo>());
        Client client2 = new Client("admin", encoder.encodePassword("Password", null), "email2@com",
                "name2", UserRole.ADMIN, avatars.get(0), new ArrayList<Photo>());

        clientService.addClient(client1);
        clientService.addClient(client2);



        for (int i = 0; i < 20; i++) {
            List<Photo> photoList =new ArrayList<>();
            Client client = new Client("login"+i, encoder.encodePassword("Password", null), "email1"+i+"@com",
                    "name"+i, UserRole.CLIENT, (i < 11) ? avatars.get(i) : avatars.get(i - 11),new ArrayList<Photo>());

            for (int j = 0; j < i; j++) {
                Photo photo =new Photo(client,(j < 11) ? avatars.get(j) : avatars.get(j - 11),new Date());
                photoList.add(photo);
            }

//           foto=photoService.save(foto);

            client.setClientPhoto(photoList);
            client=clientService.addClient(client);
//            clientService.updateClient(client);
        }
    }
}
