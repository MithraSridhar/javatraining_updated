package day12;

import java.util.ArrayList;

public class List_Demo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(1);
        al.add("dbj");//if we try to stores all these in integer it causes ClassCast exception, so they introduced Generics framework
        al.add(89.09);
        al.add(true);
//stores everything as objects only
        System.out.println(al);

        ArrayList<Integer> ali = new ArrayList<Integer>();
        // Integer - Generics - to avoid ClassCast exceptions
    }

}
