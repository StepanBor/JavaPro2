package com.gmail.stepan1983;

import java.util.List;

public interface DataInterfase {

    void addOrder(Order order);

    int addClient(Client client);

    int addProduct(Product product);

    List<Order> getOrders();

    List<Client> getClients();

    List<Product> getProducts();
}
