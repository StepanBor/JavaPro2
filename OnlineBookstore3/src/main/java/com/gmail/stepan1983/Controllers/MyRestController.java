package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.DTO.ClientDTO;
import com.gmail.stepan1983.DTO.OrderDTO;
import com.gmail.stepan1983.Service.ClientGroupService;
import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.Service.OrderService;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/userPage")
    public ResponseEntity<List<ClientDTO>> adminPage(@RequestParam(required = false, defaultValue = "1") Integer page,
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

        long clientDetailsId = (clientId == null) ? clients.get(0).getId() : clientId;


        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");

        List<Object> objectList = new ArrayList<>();

        objectList.add(clientDTOS);

        objectList.add(clientPageNum);

        return new ResponseEntity<>(clientDTOS, headers, HttpStatus.OK);
    }

    @RequestMapping("/usersCount")
    public ResponseEntity<Long> getTotalUsersCount() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", "*");

        return new ResponseEntity<>(clientService.count(), headers, HttpStatus.OK);
    }

    @RequestMapping("/orders")
    public List<OrderDTO> getUserOrders(@RequestParam(required = false) Long userId,
                                        @RequestParam(required = false, defaultValue = "0") Long pageOrders,
                                        @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage) {

        List<Order> orders;
        if (userId != null) {
            Client client = clientService.getById(userId);
            orders = orderService.findByClient(client, PageRequest.of(pageOrders.intValue(), itemsPerPage,
                    Sort.Direction.ASC, "status", "orderPrice"));
        } else {
            orders = orderService.findAll();
        }

        List<OrderDTO> ordersDTO = new ArrayList<>();

        for (Order order : orders) {
            ordersDTO.add(order.toDTO());
        }

        return ordersDTO;
    }

}
