package com.gmail.stepan1983.config;

import com.gmail.stepan1983.DAO.CategoryDAO;
import com.gmail.stepan1983.DAO.PublisherDAO;
import com.gmail.stepan1983.DAO.StockDAO;
import com.gmail.stepan1983.DAO.StorageBooksDAO;
import com.gmail.stepan1983.Service.BookService;
import com.gmail.stepan1983.Service.BookServiceImpl;
import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class TestDataBean {
    @Autowired
    private ClientService clientService;

    @Autowired
    private BookService bookService;


    @PostConstruct
    public void fillData() {
        List<File> avatars=new ArrayList<>();
        for (int i=0; i<11; i++){
            avatars.add(new File("static/images/avatar-"+i+".jpg"));
        }
        ShaPasswordEncoder encoder = new ShaPasswordEncoder();
        File image = new File("c:\\Users\\HOME\\Desktop\\817bb146cf317ccde05e716f6a495bbd.jpg");
        Client client = new Client("test1", encoder.encodePassword("Password", null), "email1@com",
                "phone1", "Adress1", "name1", "lastname1", UserRole.CUSTOMER, null,avatars.get(0));
        Client client2 = new Client("admin", encoder.encodePassword("Password", null), "email2@com",
                "phone2", "Adress2", "name2", "lastname2", UserRole.ADMIN, null,avatars.get(1));

        clientService.addClient(client);
        clientService.addClient(client2);

        Client[] clients = new Client[20];
        BookItem[] books = new BookItem[20];

        CategoryItem categoryItem = new CategoryItem("Category1", "category1 description");
        Publisher publisher = new Publisher("Publisher1", "Publisher1 adress",
                "Publisher1 Description", new ArrayList<BookItem>());
        Stock stock1 = new Stock("Stock1 adress", "Stock1 phone");

        for (int i = 0; i < 19; i++) {
            StorageBooks storageBooks=new StorageBooks(null, stock1, 10L);
            books[i] = new BookItem("name" + i, "description" + i, "Author" + i, publisher,
                    categoryItem, 100.0, storageBooks, image);
            storageBooks.setBook(books[i]);

            bookService.addBookItem(books[i]);
            clients[i] = new Client("login" + i, encoder.encodePassword("Password" + i, null), "email" + i + "@com",
                    "phone" + i, "Adress" + i, "name" + i, "lastname" + i, UserRole.CUSTOMER, null,
                    (i<11)?avatars.get(i):avatars.get(i-11));
            clientService.addClient(clients[i]);

        }


    }
}
