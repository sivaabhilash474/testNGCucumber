package com.mycompany.applicationone;

public class ClassPathExample {
    public static void main(String[] args) {
        String classPath = System.getProperty("java.class.path");
        System.out.println("Class Path: " + classPath);
    }
}
