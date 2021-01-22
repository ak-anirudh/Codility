package Iterations;

// you can also use imports, for example:
import java.util.*;
import java.util.stream.Collectors;

// ? given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

// *  example, given N = 1041 the function should return 5, 
// * because N has binary representation 10000010001 and so its longest binary gap is of length 5

public class BinaryGap {
    public static int solution(int N) {
        // write your code in Java SE 8
        try {
            return Collections.max(Arrays.asList(Integer.toBinaryString(N).replaceAll("0+$", "").split("1")).stream()
                    .mapToInt(String::length).boxed().collect(Collectors.toList()));
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Binary Gap between 1's is  --> " + solution(1001));
    }
}
