package com.gmail.stepan1983;

import java.io.*;

@SaveTo(pathToSave = "c:\\text.txt")
public class TextContainer {

    static String st = "Hello World";

@Saver
    public static void saveTo(String path, String text) {
        File file = new File(path);

        try (PrintWriter pw = new PrintWriter(file)) {
            file.createNewFile();
            System.out.println(text);
            pw.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
