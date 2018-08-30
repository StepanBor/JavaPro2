package com.gmail.stepan1983.config;

import com.gmail.stepan1983.DAO.*;
import com.gmail.stepan1983.Service.BookService;
import com.gmail.stepan1983.Service.BookServiceImpl;
import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.Service.OrderService;
import com.gmail.stepan1983.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
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
    private BookService bookService;

    @Autowired
    private OrderService orderService;

    @Autowired
    StorageBooksDAO storageBooksDAO;

    @Autowired
    CategoryDAO categoryDAO;

    @Autowired
    PublisherDAO publisherDAO;

    @Autowired
    OrderDAO orderDAO;

    @Autowired
    BookDAO bookDAO;

//    public EntityManager entityManager=entityManagerFactory.createEntityManager();

    @Autowired
    ClientGroupDAO clientGroupDAO;

    @Autowired
    StockDAO stockDAO;

    public TestDataBean() {
    }

    @PostConstruct
    public void fillData() {
        /* get avatars*/
        List<File> avatars = new ArrayList<>();
        for (int i = 0; i < 11; i++) {

//            File file = new File("C:\\Users\\borysenko\\Documents\\GitHub\\JavaPro\\JavaPro\\OnlineBookStore2\\src\\main\\webapp\\static\\images\\avatar-" + i + ".jpg");
            File file=new File("C:\\Users\\HOME\\Documents\\git\\JavaPro3\\JavaPro2\\OnlineBookStore2\\src\\main\\webapp\\static\\images\\avatar-"+i+".jpg");
            avatars.add(file);
            System.out.println(file.exists()+"WWWWWWWWWWWWWWWWWWW");
        }

        ShaPasswordEncoder encoder = new ShaPasswordEncoder();
//        File image = new File("C:\\Users\\borysenko\\Documents\\GitHub\\JavaPro\\JavaPro\\OnlineBookStore2\\src\\main\\webapp\\static\\images\\12274312_1719690841584330_6387016554043425967_n.jpg");
        File image = new File("C:\\Users\\HOME\\Documents\\git\\JavaPro3\\JavaPro2\\OnlineBookStore2\\src\\main\\webapp\\static\\images\\12274312_1719690841584330_6387016554043425967_n.jpg");


        /* create first test clients*/
        ClientGroup clientGroup1 = new ClientGroup("clintGroupName1", "clientGroupDescription1", new ArrayList<Client>());
        ClientGroup clientGroup2 = new ClientGroup("clintGroupName2", "clientGroupDescription2", new ArrayList<Client>());

        Client client1 = new Client("test1", encoder.encodePassword("Password", null), "email1@com",
                "phone1", "Adress1", "name1", "lastname1", UserRole.CUSTOMER, clientGroup1, avatars.get(0));
        Client client2 = new Client("admin", encoder.encodePassword("Password", null), "email2@com",
                "phone2", "Adress2", "name2", "lastname2", UserRole.ADMIN, clientGroup1, avatars.get(1));

        clientGroupDAO.save(clientGroup1);
        clientGroupDAO.save(clientGroup2);
        clientService.addClient(client1);
        clientService.addClient(client2);

        CategoryItem categoryItem = new CategoryItem("Category1", "category1 description", new ArrayList<BookItem>());
        Publisher publisher = new Publisher("Publisher1", "Publisher1 adress",
                "Publisher1 Description", new ArrayList<BookItem>());
        Stock stock1 = new Stock("Stock1 adress", "Stock1 phone");

        List<BookItem> orderList=new ArrayList<>();

        categoryDAO.save(categoryItem);
        stockDAO.save(stock1);
        publisherDAO.save(publisher);

        for (int i = 0; i < 19; i++) {
            /*create books*/
            StorageBooks storageBooks=new StorageBooks(null, stock1, 10L);

            BookItem book = new BookItem("name" + i, "description" + i, "Author" + i, publisher,
                    categoryItem, 100.0, storageBooks, image);

            storageBooks.setBook(book);

            book=bookService.addBookItem(book);
//            bookDAO.save(book);


            /*create clients*/
            Client client = new Client("login" + i, encoder.encodePassword("Password" + i, null), "email" + i + "@com",
                    "phone" + i, "Adress" + i, "name" + i, "lastname" + i, UserRole.CUSTOMER, clientGroup2,
                    (i < 11) ? avatars.get(i) : avatars.get(i - 11));
            client = clientService.addClient(client);

            /*create orders*/
            orderList.add(book);

            Shipment shipment=new Shipment("shipment adress"+i, "processed", null);
            Order order=new Order(orderList,client,shipment,"Processed",new Date());
            shipment.setOrder(order);
            orderService.addOrder(order);

        }


    }
}
