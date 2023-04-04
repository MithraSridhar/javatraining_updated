package Assignment1.conditionalstatement;

import java.util.Scanner;

public class Day1A1 {
    public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=20; i++) {
            //Get input from user
           // System.out.println("Enter the number");
          //  int number = sc.nextInt();
            //condition 1:if the number is even number print the square value of the number
            if( i % 2== 0){
                System.out.println(i*i);
                //System.out.println(Math.pow(number,2));
            //condition 2: if the number is odd number and divisible by 3 print separate
            } else if ((i % 2 !=0) && (i % 3==0) ) {
                System.out.println(i);
             //condition 3: if the number is divisible by 5 and 2, add 10 and print
            } else if ((i % 5==0)&&(i %2==0)) {
                System.out.println(i+10);
            }
        }
    }
}
