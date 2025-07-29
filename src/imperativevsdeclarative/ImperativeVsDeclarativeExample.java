package imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample {
    public static void main(String[] args) {
        
        // Imperative - "How" style of programming
        // Sum of first 100 numbers

        int sum =0;

        for(int i=0; i<= 100; i++){
            sum = sum + i;
        }

        System.out.println("Sum using Imperative approach :"+sum);


        // Declarative - "What" style of programming

        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Sum using Declarative approach :"+sum1);

    }
}
