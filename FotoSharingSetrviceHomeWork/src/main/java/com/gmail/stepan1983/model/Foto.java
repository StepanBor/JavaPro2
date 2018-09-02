package com.gmail.stepan1983.model;


import javax.persistence.*;
import java.io.File;
import java.util.Date;

@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @OneToOne
    private Client client;

    private File foto;

    @Temporal(value = TemporalType.DATE)
    private Date orderDate;

    public Foto(Client client, File foto, Date orderDate) {
        this.client = client;
        this.foto = foto;
        this.orderDate = orderDate;
    }

    public Foto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
