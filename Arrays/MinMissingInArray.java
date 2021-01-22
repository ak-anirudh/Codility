package Arrays;

import java.util.*;

public class MinMissingInArray {
    public static int solution(int[] A) {
        return Arrays.parallelStream(A).sorted().reduce(0, (a, b) -> ((b - a) > 1) ? a : b).getAsInt() + 1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println("Minimum Missing Number In Array -->" + solution(a));
    }

}
