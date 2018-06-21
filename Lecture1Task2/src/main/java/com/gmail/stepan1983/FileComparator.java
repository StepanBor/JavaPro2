package com.gmail.stepan1983;

import java.io.File;
import java.util.Comparator;

public class FileComparator implements Comparator<File> {

    public int compare(File o1, File o2) {

        String name1=o1.getName().substring(o1.getName().lastIndexOf("\\"));
        String name2=o2.getName().substring(o1.getName().lastIndexOf("\\"));


        return 0;
    }
}
