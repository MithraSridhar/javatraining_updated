package day16;

import java.io.*;

public class IO_demo_ByteStream {
    public static void main(String[] args) throws IOException {
        //byte stream
        //write a content to a file

        File file = new File("./demo.txt");

        String content = "Java Training Write byte stream";

        FileOutputStream fos = new FileOutputStream(file);

        fos.write(content.getBytes());

        fos.close();

        //Read a file

        FileInputStream fis = new FileInputStream(file);

        //reads in byte codes
      int i=0;
    //  read until last character
      while((i=fis.read()) != -1){
          System.out.print((char) i);
      }
        fis.close();

    }
}
