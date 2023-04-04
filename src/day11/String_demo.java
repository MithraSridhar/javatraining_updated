package day11;

public class String_demo {

    public static void main(String[] args) {

        //literal calling
        //uses string constant pool
        String s1 = "ABC";
        String s2 = "ABC";

        //System.out.println(s1.compareTo(s2)); //same content
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        //New key word always creates new memory and it does not use string constant pool
        String s3 = new String("XYZ");
        String s4 = new String("XYZ");

        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

    }
}
