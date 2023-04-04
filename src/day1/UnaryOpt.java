package day1;

public class UnaryOpt {
    public static void main(String[] args) {

        int a = 10;
/*
    for(int i=0;i<5;i++) {
      //  a++; //postfix a=a+1;
        System.out.println(a++); //hitting memory multiple times
    }
       // System.out.println("a value is "+a); // hitting memory once
    }*/

        for (int i = 0; i < 5; i++) {
            System.out.println(--a); //hitting memory multiple times as prefix
        }
    }
}