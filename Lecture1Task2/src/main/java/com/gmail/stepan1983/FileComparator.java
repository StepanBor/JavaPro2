package com.gmail.stepan1983;

import java.io.File;
import java.util.Comparator;

public class FileComparator implements Comparator<File> {

    public int compare(File o1, File o2) {

        String name1=o1.getName().substring(o1.getName().lastIndexOf("\\")+1);
        String name2=o2.getName().substring(o1.getName().lastIndexOf("\\")+1);

        if(o1.isDirectory()&o2.isDirectory()){
            return name1.compareToIgnoreCase(name2);
        }

        if(o1.isDirectory()){
            return 1;
        }

        if(o2.isDirectory()){
            return -1;
        }

        if(o1.isFile()&o2.isFile()){
            return name1.compareToIgnoreCase(name2);
        }
        return 0;
    }
}
