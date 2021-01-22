package TOPIC-test.NumDivisibility;

import java.util.Arrays;

public class MinDivisible {

    public static int MinimumNumberMultipleOfEleven(int[] A) {
        return Arrays.stream(A).filter(i -> (i % 11) == 0).min().getAsInt();
    }

    public static void main(String[] args) {
        int[] array = { 100, -22, 121, 55, 9821 };
        System.out.println("Minmimum Number Multiple of 11 in given array -->" + MinimumNumberMultipleOfEleven(array));
    }

}
