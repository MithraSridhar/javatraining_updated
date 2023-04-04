package day8;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

    public static void main(String[] args) {

        //before 1.8
        Date d = new Date();
       // System.out.println(d);
       // System.out.println(d.getHours());

        //after version 1.8
        LocalDate ld = LocalDate.now();
        //System.out.println( ld.getMonth());

        Calendar c = Calendar.getInstance();
        c.setTime(d);//set current date and time to calendar
      c.add(Calendar.DATE,-2);
        System.out.println(c.get(Calendar.DATE));
       // System.out.println(c.get(Calendar.AM_PM)); //<9 - AM, 1-PM
      //  System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
