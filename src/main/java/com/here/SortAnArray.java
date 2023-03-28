package com.here;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArray {


    public static void sort(int[] array) {
        List<Integer> toSort = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            toSort.add(array[i]);
        }
        Collections.sort(toSort);
        for (Integer i : toSort) {
            System.out.println(i);
        }
    }

    public static void sort2(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int bigger = array[i];

            while (j >= 0 && bigger < array[j]) {
                sortedArray[j + 1] = sortedArray[j];
                j = j - 1;
            }
            sortedArray[j + 1] = bigger;
        }

        for (Integer i : sortedArray) {
            System.out.println(i);

        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 3, -4, 3, -11, 7};
        sort(array);
        sort2(array);
    }

}