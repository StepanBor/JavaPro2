package com.gmail.stepan1983;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileModel {

//    private File directory;
//    private List fileList;

    public List getFileList(File directory){
        List fileList=new ArrayList<File>();
        File[] files=directory.listFiles();
        for (File file:files) {
            fileList.add(file);
        }
        return fileList;
    }




}
