package lambdas;

import java.util.*;

public class LambdasBasicExercises {

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }
    public static void main(String[] args) {

        // Simple Runnable Lambda
        Runnable r = () -> System.out.println("1. Hello World");
        new Thread(r).start();

        // Iterating a list using Lambda
        System.out.println("2. Iterating a list using lambda");
        List<String> list = new ArrayList<>(Arrays.asList("Java","Spring","Hibernate","Lambda"));
        list.forEach(item -> System.out.println(item));

        // Filtering a list using Lambda
        System.out.println("3. Filtering a list using lambda");
        list.add("Javascript");
        List<String> filteredList = list.stream()
                .filter(s-> s.startsWith("J"))
                .toList();
        filteredList.forEach(item -> System.out.println(item));

        // Sorting a list using lambda
        System.out.println("4. Filtering a list using lambda");
        list.add("Kafka");
        list.sort((s1,s2) -> s1.compareTo(s2));
        list.forEach(item -> System.out.println(item));

        //Using a custom functional interface
        System.out.println("5. Using a custom functional interface using lambda");
        Calculator add = (a,b) -> a + b;
        Calculator subtract = (a,b) -> a - b;
        Calculator multiply = (a,b) -> a * b;
        System.out.println("Addition of 2 and 3:"+ add.calculate(2,3));
        System.out.println("Subtraction of 2 and 3:"+ subtract.calculate(2,3));
        System.out.println("Multiplication of 2 and 3:"+ multiply.calculate(2,3));

        System.out.println("6. Lambda with Map iteration");
        Map<String,Integer> map = new HashMap<>();
        map.put("Java",1);
        map.put("Spring",2);
        map.put("Hibernate",3);
        map.put("Lambda",4);
        map.forEach((key,value) -> System.out.println(key+":"+value));

        System.out.println("7. Creating a Thread with lambda");
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

        System.out.println("8. lambda with comparator");
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(item -> System.out.println(item));

        System.out.println("9. Lambda with Optional");
        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(s -> System.out.println("Value of optional"+s));


    }
}
