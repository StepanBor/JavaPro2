package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.DTO.*;
import com.gmail.stepan1983.Service.*;
import com.gmail.stepan1983.config.ConsoleColors;
import com.gmail.stepan1983.config.RateRetriever;
import com.gmail.stepan1983.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import sun.security.provider.certpath.OCSPResponse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

@RestController
public class MyRestController {

    private static boolean sortDirection;

    @Autowired
    ClientService clientService;

    @Autowired
    OrderService orderService;

    @Autowired
    ClientGroupService clientGroupService;

    @Autowired
    BookService bookService;

    @Autowired
    RateRetriever rateRetriever;

    @Autowired
    TaskServiceImpl taskService;

    @Autowired
    PublisherService publisherService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    StorageBooksService storageBooksService;

    PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @CrossOrigin(origins = "*")
    @RequestMapping("/userPage")
    public List<ClientDTO> adminPage(@RequestParam(required = false, defaultValue = "1") Integer page,
                                     @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage,
                                     @RequestParam(required = false) Long clientId,
                                     @RequestParam(required = false, defaultValue = "0") Long pageOrders,
                                     @RequestParam(required = false, defaultValue = "id") String sortBy,
                                     @RequestParam(required = false, defaultValue = "false") Boolean changeSortDirect) {


        if (changeSortDirect) {
            sortDirection = !sortDirection;
        }

        long clientNum = clientService.count();

        Long clientPageNum = clientNum % itemsPerPage == 0
                ? clientNum / itemsPerPage : clientNum / itemsPerPage + 1;

        List<Client> clients = clientService.findAll(page - 1, itemsPerPage, sortBy, sortDirection);


        List<ClientDTO> clientDTOS = new ArrayList<>();

        for (Client client : clients) {
            clientDTOS.add(client.toDTO());
        }

        return clientDTOS;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/getUsers")
    public List<ClientDTO> getUsers() {

        List<Client> clients = clientService.findAll();

        List<ClientDTO> clientDTOS = new ArrayList<>();

        for (Client client : clients) {
            clientDTOS.add(client.toDTO());
        }

        return clientDTOS;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/usersCount")
    public Long getTotalUsersCount() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");

//        return new ResponseEntity<>(clientService.count(), headers, HttpStatus.OK);
        return clientService.count();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
    public ResponseEntity createNewUser(@RequestParam(required = false) MultipartFile photo,
                                        @RequestParam String login,
                                        @RequestParam String email,
                                        @RequestParam String phone,
                                        @RequestParam(required = false) String address,
                                        @RequestParam(required = false) String name,
                                        @RequestParam(required = false) String lastname,
                                        @RequestParam(required = false) String password,
                                        @RequestParam(required = false, defaultValue = "false") Boolean updateUser,
                                        @RequestParam(required = false) Long id) {

        File avatar = new File("photo");
        if (photo != null) {
            try (OutputStream os = new FileOutputStream(avatar)) {
                os.write(photo.getBytes());
                System.out.println(ConsoleColors.BLUE_UNDERLINED + avatar.length() + ConsoleColors.RESET);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> message = new ArrayList<>();
        if (updateUser) {
            Client client = clientService.getById(id);
            if (login != null) {
                client.setLogin(login);
            }
            if (email != null) {
                client.setEmail(email);
            }
            if (phone != null) {
                client.setPhone(phone);
            }
            if (address != null) {
                client.setAdress(address);
            }
            if (name != null) {
                client.setName(name);
            }
            if (lastname != null) {
                client.setLastname(lastname);
            }
            if (password != null) {
                client.setPassword(encoder.encode(password));
            }
            if (photo != null) {
                client.setAvatar(avatar);
            }
            clientService.updateClient(client);
            message.add("client profile id " + client.getId() + " updated");
            return new ResponseEntity(message, HttpStatus.OK);
        } else if (clientService.getByLogin(login) != null) {
            message.add("client with login \'" + login + "\' already exists");
            return new ResponseEntity(message, HttpStatus.OK);
        } else if (clientService.getByEmail(email) != null) {
            message.add("client with email \'" + email + "\' already exists");
            return new ResponseEntity(message, HttpStatus.OK);
        } else if (clientService.getByPhone(phone) != null) {
            message.add("client with phone \'" + phone + "\' already exists");
            return new ResponseEntity(message, HttpStatus.OK);
        }
        ClientGroup clientGroup = clientGroupService.findByGroupName("customers");
        Client newClient = new Client(login, encoder.encode(password), email, phone, address, name, lastname, UserRole.CUSTOMER, clientGroup, avatar);

        Client client = clientService.addClient(newClient);
        message.add("New user id is " + client.getId());
        return new ResponseEntity(message, HttpStatus.OK);
    }


    @CrossOrigin(origins = "*")
    @RequestMapping("/orders")
    public List<OrderDTO> getUserOrders(@RequestParam(required = false) Long userId,
                                        @RequestParam(required = false, defaultValue = "1") Long page,
                                        @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage,
                                        @RequestParam(required = false, defaultValue = "id") String sortBy,
                                        @RequestParam(required = false, defaultValue = "false") Boolean changeSortDirect,
                                        @RequestParam(required = false, defaultValue = "false") Boolean allOrders) {

        if (changeSortDirect) {
            sortDirection = !sortDirection;
        }

        List<Order> orders;
        if (allOrders) {
            orders = orderService.findAll();
        } else if (userId != null) {
            Client client = clientService.getById(userId);
            orders = orderService.findByClient(client, PageRequest.of(page.intValue() - 1, itemsPerPage,
                    Sort.Direction.ASC, "status", "orderPrice"));
        } else {
            orders = orderService.findAll(page.intValue() - 1, itemsPerPage, sortBy, sortDirection);
        }


        List<OrderDTO> ordersDTO = new ArrayList<>();

        for (Order order : orders) {
            ordersDTO.add(order.toDTO());
        }

        HttpHeaders headers = new HttpHeaders();

        return ordersDTO;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/orderCount")
    public Long getTotalOrderCount() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");
//        return new ResponseEntity<>(orderService.count(), headers, HttpStatus.OK);
        return orderService.count();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/deleteUser")
    public ResponseEntity deleteUser(@RequestParam Long userId) {
        Client client = clientService.getById(userId);

        clientService.deleteClient(client);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public ResponseEntity saveOrder(@RequestBody OrderDTO orderDTO) {


        System.out.println(ConsoleColors.PURPLE + orderDTO + ConsoleColors.RESET);

        Order order = orderDTO.toOrder();
        System.out.println(ConsoleColors.BLUE_BRIGHT + order + ConsoleColors.RESET);

        order = orderService.updateOrder(order);
//        if(order.getStatus()==OrderStatus.unProcessed){
//            Task task = new Task("Unprocessed order id "+order.getId(), "open");
//            taskService.addTask(task);
//        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/bookItems")
    public List<BookItemDTO> getBookItems(@RequestParam(required = false) Long bookId,
                                          @RequestParam(required = false) Long page,
                                          @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage,
                                          @RequestParam(required = false, defaultValue = "id") String sortBy,
                                          @RequestParam(required = false, defaultValue = "false") Boolean changeSortDirect) {

        if (changeSortDirect) {
            sortDirection = !sortDirection;
        }

        List<BookItem> bookItems;

        if (page == null) {
            bookItems = bookService.findAll();
        } else {
            bookItems = bookService.findAll(page.intValue() - 1, itemsPerPage, sortBy, sortDirection);
        }

        List<BookItemDTO> bookItemsDTO = new ArrayList<>();

        for (BookItem bookItem : bookItems) {
            bookItemsDTO.add(bookItem.toDTO());
        }

        return bookItemsDTO;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/bookItemsByParam")
    public List<BookItemDTO> getBookItemsByParam(@RequestParam(required = false) String bookName,
                                                 @RequestParam(required = false) String author,
                                                 @RequestParam(required = false) String publisher,
                                                 @RequestParam(required = false) String category) {

        List<BookItem> bookItems = new ArrayList<>();

        if (bookName != null) {
            bookItems.add(bookService.getByBookName(bookName));
        } else if (author != null) {
            bookItems = bookService.getByAuthor(author);
        } else if (publisher != null) {
            bookItems = bookService.getByPublisher(publisher);
        } else {
            bookItems = bookService.getByCategory(category);
        }

        List<BookItemDTO> bookItemsDTO = new ArrayList<>();

        for (BookItem bookItem : bookItems) {
            bookItemsDTO.add(bookItem.toDTO());
        }

        return bookItemsDTO;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/bookCount")
    public Long getTotalBookCount() {
        return bookService.count();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/saveBookItem", method = RequestMethod.POST)
    public ResponseEntity saveBookItem(@RequestBody BookItemDTO bookItemDTO) {

        BookItem bookItem = bookItemDTO.toBookItem();
        bookService.updateBookItem(bookItem);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/deleteBookItem", method = RequestMethod.POST)
    public ResponseEntity deleteBookItem(@RequestBody Long bookItemId) {
        BookItem bookItem = bookService.getById(bookItemId);
        bookService.deleteBookItem(bookItem);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/createNewBookItem", method = RequestMethod.POST)
    public ResponseEntity createNewBookItem(@RequestParam(required = false) MultipartFile cover,
                                            @RequestParam String bookName,
                                            @RequestParam String description,
                                            @RequestParam String author,
                                            @RequestParam String publisherName,
//                                            @RequestParam String publisherName,
//                                            @RequestParam String publisherDescription,
//                                            @RequestParam String publisherAdress,
                                            @RequestParam(required = false) Long categoryId,
                                            @RequestParam(required = false) Double price,
                                            @RequestParam(required = false) String ISBN,
                                            @RequestParam(required = false, defaultValue = "false") Boolean updateBook,
                                            @RequestParam(required = false) Long id) {

        File bookCover = new File("cover");
        if (cover != null) {
            bookCover = new File(cover.getName());
            try (OutputStream os = new FileOutputStream(bookCover)) {
                os.write(cover.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Publisher publisher = publisherService.getByName(publisherName);
        CategoryItem categoryItem = categoryService.getById(categoryId);

        if (updateBook) {
            BookItem bookItem = bookService.getById(id);

            bookItem.setISBN(ISBN);
            bookItem.setBookName(bookName);
            bookItem.setDescription(description);
            bookItem.setPrice(price);
            bookItem.setAuthor(author);
            bookItem.setPublisher(publisherService.getByName(publisherName));
            bookItem.setCategory(categoryItem);
            if (cover != null) {
                bookItem.setCover(bookCover);
            }

            bookService.updateBookItem(bookItem);
            return new ResponseEntity(HttpStatus.OK);
        }


        BookItem newBookItem = new BookItem(bookName, description, author, publisher,
                categoryItem, price, new StorageBooks(), bookCover, 0, ISBN);

        bookService.updateBookItem(newBookItem);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/storageBook")
    public StorageBookDTO getStorageBook() {
        List<StorageBooks> storageBooksList = storageBooksService.findAll();
        StorageBookDTO storageBookDTO = storageBooksList.get(0).toStorageDTO();
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + storageBookDTO + ConsoleColors.RESET);
        return storageBookDTO;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/deleteOrder", method = RequestMethod.POST)
    public ResponseEntity deleteOrder(@RequestBody OrderDTO orderDTO) {

        System.out.println(ConsoleColors.YELLOW + orderDTO + ConsoleColors.RESET);

        Order order = orderDTO.toOrder();

        System.out.println(ConsoleColors.RED + order + ConsoleColors.RESET);

        orderService.deleteOrder(order);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/createNewOrder")
    public ResponseEntity createNewOrder() {

        Shipment shipment = new Shipment("", "unProcessed", null);
        ClientGroup clientGroup = clientGroupService.findByGroupName("customers");
        Client client = new Client("default", "", "default", "default",
                "default", "default", "default",
                UserRole.CUSTOMER, clientGroup, new File("default"));
        Order order = new Order(new ArrayList<BookItem>(), client, shipment, OrderStatus.unProcessed, new Date());
        shipment.setOrder(order);
//        clientService.addClient(client);
        order = orderService.addOrder(order);
        System.out.println(ConsoleColors.BLUE_UNDERLINED + order + ConsoleColors.RESET);
        return new ResponseEntity<>(order.getId(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/countOrdersByParam", method = RequestMethod.GET)
    public ResponseEntity countOrdersByParam(@RequestParam String paramName,
                                             @RequestParam String paramValue) {

        System.out.println(ConsoleColors.BLUE_UNDERLINED + orderService.countByParam(paramName, paramValue) + ConsoleColors.RESET);
        return new ResponseEntity<>(orderService.countByParam(paramName, paramValue), HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/rates", method = RequestMethod.GET)
    public Rate getRates() {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> response = restTemplate.getForEntity
//                ("http://apilayer.net/api/live?access_key=8742691146d4666a721d276747be45ab&currencies=UAH,USD,EUR,RUB",
//                        String.class);


        return rateRetriever.getRate();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public List<Task> updateTasks(@RequestBody TaskDTO taskDTO) {

        Task task = taskDTO.toTask();
//        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+task+ConsoleColors.RESET);
        if (!task.getStatus().equals("closed")) {
            taskService.addTask(task);
        } else if (task.getStatus().equals("closed")) {
            taskService.deleteTask(task);
        }

        return taskService.findByStatus("open");
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getTasks")
    public List<Task> getTasks() {

        return taskService.findByStatus("open");
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getBookParameters")
    public List<List<String>> getBookParameters() {

        List<List<String>> result = new ArrayList<>();

        List<String> categories = new ArrayList<>();
        List<String> authorsList = new ArrayList<>();
        Set<String> authorsSet = new HashSet<>();
        List<String> publishers = new ArrayList<>();

        List<BookItem> bookItems = bookService.findAll();
        List<CategoryItem> categoryItems = categoryService.findAll();
        List<Publisher> publishers1 = publisherService.findAll();

        for (BookItem bookItem : bookItems) {
            if (!authorsSet.contains(bookItem.getAuthor())) {
                authorsSet.add(bookItem.getAuthor());
            }
        }
        authorsList.addAll(authorsSet);

        for (CategoryItem categoryItem : categoryItems) {
            categories.add(categoryItem.getCategoryName());
        }

        for (Publisher publisher : publishers1) {
            publishers.add(publisher.getPublisherName());
        }

        result.add(categories);
        result.add(authorsList);
        result.add(publishers);

        return result;

    }

}
