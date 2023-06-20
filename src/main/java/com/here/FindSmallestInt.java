package com.here;

import java.util.Arrays;

public class FindSmallestInt {

    static int solution(int[] A) {
        int result = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            int first = A[i];
            int second = A[i + 1];
            if (second - first > 1) {
                result = first + 1;
                if (result < 1) {
                    return 1;
                }
                return result;
            }
            if (i == A.length - 2) {
                if (A[0] > 1) {
                    return A[0] - 1;
                }
                return A[A.length - 1] + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 4, 5};
        int[] thirdArr = {1, 2, 3, 4, 5};
        int[] fourthArr = {-1, -3};
        int[] fifthArr = {3, 4, 5};
        System.out.println(solution(firstArr));
        System.out.println(solution(secondArr));
        System.out.println(solution(thirdArr));
        System.out.println(solution(fourthArr));
        System.out.println(solution(fifthArr));
    }


}
