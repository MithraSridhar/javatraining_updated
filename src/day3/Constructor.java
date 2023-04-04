package day3;

class Employee {

    int id; //4 bytes
    String name;


  //default constructor
     Employee(){
        System.out.println("Day3.Employee constructor");
    }
   //parameterized constructor
     Employee(String name){
         System.out.println("Day3.Employee constructor = " +name);
     }

    public void display(){
        System.out.println("Day3.Employee");
    }




}


public class Constructor{

    public static void main(String[] args) {
        Employee obj = new Employee(); //creating new memory for that class by creating a memory for default constructor obj
        Employee obj1 = new Employee("Mithra"); //creating new memory for that class by creating a memory for parameterised constructor obj
        obj.display();

    }


}