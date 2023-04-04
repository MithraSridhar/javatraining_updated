package Assignment2.studentmarks;

public class Student {

   private String name;
   private Marks marks;
   public Student(String name,Marks marks) {
        this.name=name;
        this.marks=marks;
    }

    public void setName(String name){
       this.name=name;
    }

    public String getName(){
        return name;
    }

    public Marks getMarks(){
       return marks;
    }

    public void setMarks(Marks marks){
        this.marks=marks;
    }
}
