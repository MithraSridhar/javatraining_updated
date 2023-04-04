package day15;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mithr","Mithra","Mithra"); //coverting array to a list
        //count the values in array
        int count = (int) names.stream().count(); //converting to stream of data
        System.out.println(count);
        //count particular string
        int count1 = (int) names.stream().filter(str->str.equalsIgnoreCase("Mithra")).count(); //like for each loop
        System.out.println(count1);
        //count empty string
        int count3 = (int) names.stream().filter(str->str.isEmpty()).count();
        System.out.println(count3);
       //creating another sub collection from collection
       List<String> emptyList=names.stream().filter(str->str.isEmpty()).collect(Collectors.toList());
        System.out.println(emptyList);

        //maps values from collection into a different value and creating another collection
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        List<Integer> mapList=  number.stream().map(i->i+1).collect(Collectors.toList());
        System.out.println(mapList);

        //maps values from collection into a different value and creating another collection with distinct
        List<Integer> number1 = Arrays.asList(1,5,2,4,3);
        List<Integer> mapList1=  number.stream().map(i->i+1).distinct().collect(Collectors.toList());
        System.out.println(mapList1);

        //statistics methods - will give all basis statistics like sum, min and max
        IntSummaryStatistics stats=  number1.stream().mapToInt(x->x).summaryStatistics();
        System.out.println(stats);
        System.out.println(stats.getMax());

        //limiting the stream capacity (length and iterate limit)
        List<Integer> limitList=  number1.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitList);

        //limiting the stream capacity (length and iterate limit) - sorted
        List<Integer> limitList1=  number1.stream().limit(3).sorted().collect(Collectors.toList());
        System.out.println(limitList1);

    }
}
