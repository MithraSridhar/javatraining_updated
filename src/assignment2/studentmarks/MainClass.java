package Assignment2.studentmarks;

public class MainClass {
    public static void main(String[] args) {


        Student student1 = new Student("Mithra",new Marks(87,76,85,90,90));
        Student student2 = new Student("Ram",new Marks(87,86,75,80,90));
        Student student3 = new Student("Indhu",new Marks(87,86,95,80,90));

        MarksHelper.getTotalMarks(student1);
        MarksHelper.getTotalMarks(student2);
        MarksHelper.getTotalMarks(student3);

    }
}
