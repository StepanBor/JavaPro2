package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.jar.JarFile;
import java.util.jar.Pack200;
import java.util.zip.GZIPOutputStream;

@Entity
@Table(name = "Archives")
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    File archive;

    String name;

    public Archive(File file) {
        this.archive = packFile(file);
        this.name=archive.getName();
    }

    public Archive() {
    }

    public File packFile(File file) {

        File archive=new File("file.getName()"+".zip");
        try(FileOutputStream fos = new FileOutputStream(archive);
            GZIPOutputStream gz = new GZIPOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(gz)) {
            oos.writeObject(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return archive;

    }

    public String getName() {
        return name;
    }

    public File getArchive() {
        return archive;
    }

    public void setArchive(File archive) {
        this.archive = archive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "id=" + id +
                ", archive=" + archive +
                ", name='" + name + '\'' +
                '}';
    }
}
