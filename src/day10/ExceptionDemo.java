package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) throws IOException {
        System.out.println(1/0); // JVM already knows the exception because it is already present in java library java.lang

        //checked exception
        //telling JVM I am using file
        File file = new File("");

        //trying to use it as a arg of this file..trying to communicate with the file
        FileInputStream fis = new FileInputStream(file);
         fis.read();

    }
}
