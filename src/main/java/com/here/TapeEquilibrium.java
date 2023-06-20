package com.here;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {


    static int countTape(int[] A) {
        List<Integer> result = new ArrayList<>();
        int differance = 0, firstTape = 0, secondTape = 0;
        for (int i = 0; i < A.length; i++) {
            firstTape += A[i];
            for (int j = i + 1; j < A.length; j++) {
                secondTape += A[j];
            }
            differance = Math.abs(firstTape - secondTape);
            result.add(differance);
            secondTape = 0;
        }
        return Collections.min(result);
    }

    public static void main(String[] args) {
        int[] firstTable = {3, 1, 2, 4, 3};
        System.out.println(countTape(firstTable));
    }
}
