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

    public static void ownSort(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

            for (int j = 0; j < array.length - 1; j++) {
                int first = sortedArray[j];
                int second = sortedArray[j + 1];
                while (first > second && j >= 0) {
                    sortedArray[j] = second;
                    sortedArray[j + 1] = first;
                    j--;
                    if (j >= 0) {
                        first = sortedArray[j];
                        second = sortedArray[j + 1];
                    }
                }
            }

        for (Integer i : sortedArray) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 3, -4, 3, -11, 7};
        sort(array);
        ownSort(array);
    }

}