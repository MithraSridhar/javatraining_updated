package day8;

class Employee{
    int id;
    public void setId(int id){
this.id=id;
    }

    @Override
    public int hashCode() {

        return id;
    }
}

public class CompareToDemo {
    public static void main(String[] args) {
        String s   ="Abc";
        String s2  ="Abc";

        //compares content
        System.out.println(s.compareTo(s2));//lexicographical

        //compares memory
        System.out.println(s.equals(s2));

        Employee e1 = new Employee();
        e1.setId(1);

        Employee e2 = new Employee();
        e2.setId(1);

        System.out.println(e1.equals(e2));
        //in case of obj, it always creates a new memory

        //hashcode
    if(e1.hashCode() == e2.hashCode()){
        System.out.println("True");
    }
    }
}
