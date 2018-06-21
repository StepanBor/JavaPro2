package com.gmail.stepan1983;

import java.io.File;
import java.util.List;

public class MainDebug {
    public static void main(String[] args) {
        FileModel fm=new FileModel();

        File filFolder=new File("e:\\");

        List<File> lf=fm.getFileList(filFolder);
        System.out.println(fm.getFileList(filFolder));
        System.out.println();
        System.out.println();

        System.out.println(lf.get(1).getName().substring(lf.get(1).getName().lastIndexOf("\\")+1));
    }
}
