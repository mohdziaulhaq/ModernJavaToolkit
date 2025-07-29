package imperativevsdeclarative;

import java.util.*;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,34,53,545,45,1,23,2,2,3,5,3,3);

        //Imperative

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("Unique List using Imperative: "+uniqueList);
 
        List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique list using Declarative Programming: "+uniqueList1);
    }
}
