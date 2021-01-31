package TOPIC-test.MaxNum;

import java.util.*;

public class MaximumPossible {

    public static int solution(int N) {
        if (N == 0) {
            return 5 * 10;
        }
        int negative = N / Math.abs(N);
        N = Math.abs(N);
        int maxVal = Integer.MIN_VALUE;
        int counter = 0, position = 1;
        int m = N;
        while (m > 0) {
            counter++;
            m = m / 10;
        }

        for (int i = 0; i <= counter; i++) {
            int newVal = ((N / position) * (position * 10)) + (5 * position) + (N % position);
            if (newVal * negative > maxVal) {
                maxVal = newVal * negative;
            }
            position = position * 10;
        }
        return maxVal;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Possible Number by inserting 5 for the given number is -->" + solution(276));

    }

}
