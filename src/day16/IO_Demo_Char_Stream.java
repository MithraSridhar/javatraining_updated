package day16;

import java.io.*;

public class IO_Demo_Char_Stream {
    public static void main(String[] args) throws IOException {

        //char stream
        //write a content
        File file = new File("./demo1.txt");
        String content = "Java Training Write Char stream";

        FileWriter fw = new FileWriter(file);
        fw.write(content);
        fw.close();


        //Read a content to a file



        FileReader fr = new FileReader(file);
        //it reads in unicode
        int i=0;

        while((i=fr.read()) !=-1){
            System.out.print((char) i);
        }
        fr.close();
    }
}
