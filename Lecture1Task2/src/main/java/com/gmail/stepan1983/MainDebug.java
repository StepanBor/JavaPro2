package com.gmail.stepan1983;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public class MainDebug {
    public static void main(String[] args) throws IOException {
        FileModel fm=new FileModel();

        File filFolder=new File("d:\\");

        List<File> lf=fm.getFileList(filFolder);
        System.out.println(fm.getFileList(filFolder));
        System.out.println();
        System.out.println();
//        try {
            System.out.println(lf.get(1).getAbsolutePath());
        System.out.println(lf.get(1).getAbsoluteFile());
        System.out.println(lf.get(1).getCanonicalFile());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        System.out.println(lf.get(1).getName().substring(lf.get(1).getName().lastIndexOf("\\")+1));
    }
}
