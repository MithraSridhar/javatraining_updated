package day3;

class Student {

     int[] marks;
     String name;
     int totalMarks;
     int markAverage;
     char grade;

     Student(int[] marks, String name) {
         this.marks = marks;
         this.name = name;
         System.out.println("Day3.Student name is " + name);
         for (int i = 0; i < marks.length; i++) {
             System.out.println("Mark"+(i+1)+" of the student " + name + " is " + marks[i]);
         }
         getTotalMarks(marks, name);
         getGrade(name);
     }

     public int getTotalMarks(int[] marks, String name) {

         for (int i = 0; i < marks.length; i++) {
             totalMarks += marks[i];
         }
         System.out.println("The total mark of the student " + name + " is " + totalMarks);
         return totalMarks;
     }

     public void getGrade(String name) {
         markAverage = totalMarks / marks.length;
         System.out.println("Students average mark is " + markAverage);
         if (markAverage > 90) {
             grade = 'A';
             System.out.println("The grade of the student " + name + " is " + grade);
         } else if (markAverage > 80 && markAverage <= 90) {
             grade = 'B';
             System.out.println("The grade of the student " + name + " is " + grade);
         } else if (markAverage >= 65 && markAverage <= 80) {
             grade = 'C';
             System.out.println("The grade of the student " + name + " is " + grade);
         } else if (markAverage < 65) {
             System.out.println("The student " + name + " is failed the exam");
         }

     }
 }

public class Main_A2{

    public static void main(String[] args) {

        int [] markS1={90,87,86,85,80};
        int [] markS2={89,67,96,75,69};
        int [] markS3={68,79,89,60,90};

        Student student1 = new Student(markS1,"Mithra");
        Student student2 = new Student(markS2,"Ram");
        Student student3 = new Student(markS3,"Indhu");
    }

}
