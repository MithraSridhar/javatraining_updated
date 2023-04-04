package day11;

public class String_immutable {
    public static void main(String[] args) {
        String s="ABC";
        System.out.println(System.identityHashCode(s));
        s="ABCD";

        System.out.println(s);
        System.out.println(System.identityHashCode(s));

        String t = "Bita"+"Training"+"java"; //+ symbol concatenates

        // s=Bita //memory 18
        //s = Bita training // memory 19
        //s= Bita training java // memory 20
        t.concat("ANC "); //creates new memory hence we go for string buffer

        StringBuffer sb = new StringBuffer();
        sb.append("Mithra");//does not create new memory
        System.out.println(System.identityHashCode(sb));
        sb.append("Mithra");//does not create new memory
        System.out.println(System.identityHashCode(sb));
        sb.append("Mithra"); //does not create new memory
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.toString());

        StringBuilder stringBuilder = new StringBuilder();
    }
}
