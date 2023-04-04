package assignment4.stringconditions;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class String_Conditions {

    public static void main(String[] args) {



        String input ="mithraat";
//nested if
       /* if(checkLength(input)&&checkChar(input)&&checkCamelCase(input)&&checkComma(input)&&replaceDuplicate(input)){
            System.out.println("At least one of string conditions satisfied");
        }*/
       /* checkLength(input);
        checkChar(input);
        checkCamelCase(input);
        checkComma(input);*/
        replaceDuplicate(input);
    }

    public static boolean checkLength(String input){
        if(input.length()>5){
            System.out.println("String length satisfies the condition of length greater than 5");
            return true;
        }
        else{
            System.out.println("String length does not satisfies the condition of length greater than 5");
            return false;
        }
    }

    public static boolean checkChar(String input){
        if(Character.isDigit(input.charAt(2))){
            System.out.println("3rd character in the string is a number");
            return true;
        }
        else{
            System.out.println("3rd character in the string is not a number");
            return false;
        }
    }

    public static boolean checkCamelCase(String input){
        String camelCasePattern = "^[a-z]+([A-Z][a-z0-9]+)+";

        if(input.matches(camelCasePattern)){
            System.out.println("String starts with a camel case");
            return true;
        }
        else{
            System.out.println("String does not starts with a camel case");
            return false;
        }

    }

    public static boolean checkComma(String input){

            String [] str = input.split("[,]");
            for ( String eachstring:str ) {
                System.out.println("Split string substring : "+eachstring);
            }
            return true;

    }

    public static void replaceDuplicate(String input) {

        char[] charArray = input.toCharArray();
        for(int i=0;i<input.length();i++){

            for (int j =i+1; j<input.length();j++){
                if(charArray[i]==charArray[j]){
                    charArray[i]='*';
                    break;
                }
            }

        }
        System.out.println(charArray);
      /*  String finalString = null;
        Map<Character, Integer> map
                = new HashMap<Character, Integer>();


        char[] charArray = input.toCharArray();


        for (char c : charArray) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {
            if (entry.getValue() > 1) {
                arrayList.add(entry.getKey());

            }
        }
        System.out.println(arrayList);

        for(int i=0;i<arrayList.size();i++){
          finalString = input.replace((char)arrayList.get(i),'*');
            System.out.println(finalString);
        }*/

    }

}
