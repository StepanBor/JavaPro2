package com.gmail.stepan1983;

import java.io.*;
import java.lang.reflect.Field;

public class Serializator {

    public static File serialize(Object obj, String path) {

        Class<?> objClass = obj.getClass();

        Field[] objFields = objClass.getDeclaredFields();

        File result = new File(path + "\\" + objClass.getCanonicalName());

        try (PrintWriter pw = new PrintWriter(result)) {

            result.createNewFile();
            pw.println(objClass.getCanonicalName());
//            pw.println();

            for (Field field : objFields) {

                if (field.isAnnotationPresent(Save.class)) {
                    if (field.getType() == int.class || field.getType() == String.class || field.getType() == char.class
                            || field.getType() == long.class || field.getType() == byte.class || field.getType() == double.class
                            || field.getType() == short.class || field.getType() == float.class) {
                        field.setAccessible(true);

                        pw.println(field.getType().getCanonicalName());
                        pw.println(field.getName());
                        pw.println(field.get(obj).toString());
//                        pw.println();
                    } else {
                        field.setAccessible(true);
                        pw.println("File");
                        pw.println(field.getType().getCanonicalName());
                        pw.println(Serializator.serialize(field.get(obj), path).getAbsolutePath());
//                        pw.println();
                    }

                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return result;
    }


    public static <T> T deserialize(T obj, File file) throws FileNotFoundException {

        if (!file.exists()) {
            System.out.println("hhhhhhhh");
            throw new FileNotFoundException();
        }

        Class<?> inputObjClass = obj.getClass();


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            Class<?> fileObjClass = Class.forName(br.readLine());

            if (fileObjClass != inputObjClass) {

                throw new ClassNotFoundException();
            }

//            System.out.println(fileObjClass.toString());
//            System.out.println(fileObjClass==objClass);

            Field[] inputObjFields = inputObjClass.getDeclaredFields();
                int count=0;
            for (Field tempField : inputObjFields) {
//                System.out.println(tempField);
//                System.out.println(count++);
                if (tempField.isAnnotationPresent(Save.class)) {
                    String tempString = br.readLine();
//                    System.out.println(tempString+"ggggggg");
//                    Class tempClass=Class.forName(tempString);
                    tempField.setAccessible(true);

                    if (tempString.equals("File")) {
                        Object tempObj = Serializator.deserialize(Class.forName(br.readLine()).newInstance(), new File(br.readLine()));
                        tempField.set(obj, tempObj);
                        continue;
                    }
                    if(tempField.getType()==int.class){
                        br.readLine();
                        tempField.setInt(obj,Integer.parseInt(br.readLine()));
                        continue;
                    }
                    if(tempField.getType()==String.class){
                        br.readLine();
                        tempField.set(obj, br.readLine());
                        continue;
                    }
                    if(tempField.getType()==double.class){
                        br.readLine();
                        tempField.setDouble(obj,Double.parseDouble(br.readLine()));
                        continue;
                    }

                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return obj;
    }


}
