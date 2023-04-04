package Assignment2.studentmarks;

public class MarksHelper {

    public static int getTotalMarks(Student student) {
        System.out.println("Student name is "+student.getName());
        Marks marks = student.getMarks();
        System.out.println("Student mark1 is " + marks.getM1());
        System.out.println("Student mark2 is " + marks.getM2());
        System.out.println("Student mark3 is " + marks.getM3());
        System.out.println("Student mark4 is " + marks.getM4());
        System.out.println("Student mark5 is " + marks.getM5());
        int  totalMarks = marks.getM1()+marks.getM2()+marks.getM3()+marks.getM4()+marks.getM5();
        getGrade(student.getName(),totalMarks );
        return totalMarks;
    }

    public static void getGrade(String name, int totalMarks) {
      int  markAverage = totalMarks / 5;
      char grade;
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
