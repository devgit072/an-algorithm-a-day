package com.devrajs.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassloaderDemo {

    static void exceptionDemo()
    {
        try
        {
            File file = new File("file");
            FileInputStream fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("here");
            throw new NullPointerException();
        }
    }
    public static void main(String[] args) {
        String s1 = new String("pankaj");
        String s2 = new String("PANKAJ");
        System.out.println(s1 = s2);
    }
}