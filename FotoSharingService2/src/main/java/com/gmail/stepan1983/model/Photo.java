package com.gmail.stepan1983.model;


import javax.persistence.*;
import java.io.File;
import java.util.Date;

@Entity
@Table(name = "Foto1")
public class Photo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "fotoId")
    private long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE},fetch = FetchType.EAGER)
    private Client client;

    private File foto;

    @Temporal(value = TemporalType.DATE)
    private Date publishDate;

    public Photo(Client client, File foto, Date publishDate) {
        this.client = client;
        this.foto = foto;
        this.publishDate = publishDate;
    }

    public Photo() {
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

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
