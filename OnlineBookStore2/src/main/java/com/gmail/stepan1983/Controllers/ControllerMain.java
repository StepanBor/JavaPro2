package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.Service.OrderService;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

@Controller
public class ControllerMain {

//    private static final int ITEMS_PER_PAGE = 6;

    @Autowired
    ClientService clientService;

    @Autowired
    OrderService orderService;

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/adminPage")
    public String adminPage(Model model, @RequestParam(required = false, defaultValue = "0") Integer page,
                            @RequestParam(required = false, defaultValue = "6") Integer itemsPerPage,
                            @RequestParam(required = false) Long clientId,
                            @RequestParam(required = false, defaultValue = "0") Long pageOrders) {


        String sortBy="id";

        long clientNum = clientService.count();

        long clientPageNum = clientNum % itemsPerPage == 0
                ? clientNum / itemsPerPage : clientNum / itemsPerPage + 1;

//        List<Client> clients = clientService.findAll(PageRequest.of(page, itemsPerPage));
        List<Client> clients = clientService.findAll(page, itemsPerPage, sortBy, true);

        long clientDetailsId = (clientId == null) ? clients.get(0).getId() : clientId;

        Client client = clientService.getById(clientDetailsId);

        List<Order> orders = orderService.findByClient(client, PageRequest.of(pageOrders.intValue(), itemsPerPage,
                        Sort.Direction.ASC, "status", "orderPrice"));

        model.addAttribute("clients", clients);
        model.addAttribute("clientsPagesNum", clientPageNum);
        model.addAttribute("page", page);
        model.addAttribute("clientDetails", client);
        model.addAttribute("orders",orders);
        System.out.println();
        System.out.println(orders);
        System.out.println(client);
        return "adminPage";
    }

    @RequestMapping("/photo/{photoId}")
    public ResponseEntity<byte[]> getPhotoBytes(@PathVariable("photoId") long id) {


        Client client = clientService.getById(id);
        File file = client.getAvatar();
        byte[] bytes = null;
        byte[] buffer = new byte[(int) file.length()];
        try (InputStream in = new FileInputStream(file); ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            int read = 0;
            while ((read = in.read(buffer)) > 0) {
                baos.write(buffer, 0, read);
            }
            bytes = baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);

    }
}
