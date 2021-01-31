package TOPIC-test.FizzBuzz;

// ? Write a program that prints the numbers from 1 to 100. 
// ? But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
// ? For numbers which are multiples of both three and five print “FizzBuzz”."

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void fizzbuzzLogic() {
        IntStream.range(1, 100).mapToObj(i -> {
            if ((i % 15 == 0))
                return "FizzBuzz";
            else if (i % 5 == 0)
                return "Buzz";
            else if (i % 3 == 0)
                return "Fizz";
            else
                return i;
        }).forEach(System.out::println);
    }

    public static void main(String[] args) {
        fizzbuzzLogic();
    }
}