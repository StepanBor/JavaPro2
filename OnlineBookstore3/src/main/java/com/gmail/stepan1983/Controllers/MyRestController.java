package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.DTO.BookItemDTO;
import com.gmail.stepan1983.DTO.ClientDTO;
import com.gmail.stepan1983.DTO.OrderDTO;
import com.gmail.stepan1983.Service.BookService;
import com.gmail.stepan1983.Service.ClientGroupService;
import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.Service.OrderService;
import com.gmail.stepan1983.config.ConsoleColors;
import com.gmail.stepan1983.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.security.provider.certpath.OCSPResponse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

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

    @CrossOrigin(origins = "http://localhost:4200")
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

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/getUsers")
    public List<ClientDTO> getUsers() {

        List<Client> clients = clientService.findAll();

        List<ClientDTO> clientDTOS = new ArrayList<>();

        for (Client client : clients) {
            clientDTOS.add(client.toDTO());
        }

        return clientDTOS;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/usersCount")
    public Long getTotalUsersCount() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");

//        return new ResponseEntity<>(clientService.count(), headers, HttpStatus.OK);
        return clientService.count();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
    public ResponseEntity createNewUser(@RequestParam(required = false) MultipartFile photo,
                                        @RequestParam String login,
                                        @RequestParam String email,
                                        @RequestParam String phone,
                                        @RequestParam(required = false) String address,
                                        @RequestParam(required = false) String name,
                                        @RequestParam(required = false) String lastname,
                                        @RequestParam(required = false) String password) {
        File avatar = new File("photo");

        try (OutputStream os = new FileOutputStream(avatar)) {
            os.write(photo.getBytes());
            System.out.println(ConsoleColors.BLUE_UNDERLINED + avatar.length() + ConsoleColors.RESET);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String message = "user created";
        if (clientService.getByLogin(login) != null) {
            message = "client with login \'" + login + "\' already exists";
            return new ResponseEntity(message, HttpStatus.OK);
        } else if (clientService.getByEmail(email) != null) {
            message = "client with email \'" + email + "\' already exists";
            return new ResponseEntity(message, HttpStatus.OK);
        } else if (clientService.getByPhone(phone) != null) {
            message = "client with phone \'" + phone + "\' already exists";
            return new ResponseEntity(message, HttpStatus.OK);
        }
        ClientGroup clientGroup=clientGroupService.findByGroupName("customers");
        Client newClient= new Client(login,password,email,phone,address,name,lastname,UserRole.CUSTOMER,clientGroup,avatar);

        clientService.addClient(newClient);

        return new ResponseEntity(message, HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/orders")
    public List<OrderDTO> getUserOrders(@RequestParam(required = false) Long userId,
                                        @RequestParam(required = false, defaultValue = "1") Long page,
                                        @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage,
                                        @RequestParam(required = false, defaultValue = "id") String sortBy,
                                        @RequestParam(required = false, defaultValue = "false") Boolean changeSortDirect) {

        if (changeSortDirect) {
            sortDirection = !sortDirection;
        }

        List<Order> orders;
        if (userId != null) {
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

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/orderCount")
    public Long getTotalOrderCount() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");
//        return new ResponseEntity<>(orderService.count(), headers, HttpStatus.OK);
        return orderService.count();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public ResponseEntity saveOrder(@RequestBody OrderDTO orderDTO) {

        System.out.println(ConsoleColors.PURPLE + orderDTO + ConsoleColors.RESET);

        Order order = orderDTO.toOrder();
        System.out.println(ConsoleColors.BLUE_BRIGHT + order + ConsoleColors.RESET);

        orderService.updateOrder(order);


        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/bookItems")
    public List<BookItemDTO> getBookItems(@RequestParam(required = false) Long userId,
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

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/bookCount")
    public Long getTotalBookCount() {
        return bookService.count();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/deleteOrder", method = RequestMethod.POST)
    public ResponseEntity deleteOrder(@RequestBody OrderDTO orderDTO) {

        System.out.println(ConsoleColors.YELLOW + orderDTO + ConsoleColors.RESET);

        Order order = orderDTO.toOrder();

        System.out.println(ConsoleColors.RED + order + ConsoleColors.RESET);

        orderService.deleteOrder(order);

        return new ResponseEntity(HttpStatus.OK);
    }
}
