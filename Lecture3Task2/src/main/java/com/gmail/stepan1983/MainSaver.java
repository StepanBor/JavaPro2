package com.gmail.stepan1983;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainSaver {
    public static void main(String[] args) {
        Class<?> textContainer=TextContainer.class;
        try {
            Field text=textContainer.getDeclaredField("st");

            SaveTo saveTo=textContainer.getAnnotation(SaveTo.class);

            Method[] saver=textContainer.getDeclaredMethods();

            for (Method met:saver) {

                if(met.isAnnotationPresent(Saver.class)){
                    Saver saverAno=met.getDeclaredAnnotation(Saver.class);
                    System.out.println(saveTo.pathToSave()+(String) text.get(null));
                    met.invoke(null,  saveTo.pathToSave(), (String) text.get(null));
                }
            }


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
