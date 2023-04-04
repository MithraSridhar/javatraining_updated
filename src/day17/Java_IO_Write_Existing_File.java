package day17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java_IO_Write_Existing_File {
    public static void main(String[] args) throws IOException {
        //char stream
        //write a content
        File file = new File("./demo2.txt");
        String content = "Java Training Update File";

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw) ; //append
        bw.write(content);
        bw = new BufferedWriter(fw);
        bw.write(" append");
        bw.close();
        fw.close();
    }
}
