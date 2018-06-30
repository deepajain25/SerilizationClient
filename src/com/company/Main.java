package com.company;

import java.io.*;

public class Main {
    private static final String SER_FILE = "C:\\Users\\HOME\\IdeaProjects\\example.ser";

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream(SER_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SerializationTest serializationTestDes = (SerializationTest) objectInputStream.readObject();
            System.out.println(serializationTestDes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
