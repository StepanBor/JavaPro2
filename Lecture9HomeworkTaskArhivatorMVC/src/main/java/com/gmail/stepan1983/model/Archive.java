package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.jar.JarFile;
import java.util.jar.Pack200;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

        String archName=file.getName().substring(0,file.getName().lastIndexOf(".")+1)+"zip";
        System.out.println(archName+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        File archive=new File(archName);

        Path path = file.toPath();


        ZipEntry zipEntry=new ZipEntry(file.getName());
        try(FileOutputStream fos = new FileOutputStream(archive);
            ZipOutputStream zOut = new ZipOutputStream(fos)) {
            zOut.putNextEntry(zipEntry);
            byte[] data = Files.readAllBytes(path);

            zOut.write(data,0,data.length);
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
