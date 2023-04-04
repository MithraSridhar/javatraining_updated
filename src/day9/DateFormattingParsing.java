package day9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingParsing {
    public static void main(String[] args) throws ParseException {
        Date today = new Date();
        System.out.println("Original Date "+today);

//date formatting
       /* SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd/MM/yy");
        format.format(today);*/
        SimpleDateFormat format = new SimpleDateFormat("EEEE dd/MM/yy hh:mm:ss zzzz");
        //SimpleDateFormat format = new SimpleDateFormat("d/M/y");
        String formattedDate= format.format(today); //02/03/23
        System.out.println("Formatted date String "+formattedDate);

//parsing
     Date parsedDate=   format.parse(formattedDate);
        System.out.println("Parsed Date "+parsedDate);

    }
}
