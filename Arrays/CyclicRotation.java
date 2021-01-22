package Arrays;

import java.util.*;

// ? given an array A consisting of N integers and an integer K, returns the array A rotated K times

// * Example -  A = [3, 8, 9, 7, 6] K = 3
// * Output - [9, 7, 6, 3, 8]

public class CyclicRotation {

    public static Integer[] solution(Integer[] A, int K) {
        Collections.rotate(Arrays.asList(A), K);
        return A;
    }

    public static void main(String[] args) {
        Integer[] test = { 1, 2, 3, 4, 5 };
        System.out.println("Rotation of the given Array" + Arrays.toString(solution((test), 3)));
    }

}
