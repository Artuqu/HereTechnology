package com.here;

public class FindElement {

    public static boolean exists(int element, int[] array) {
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        int[] array = new int[]{-3, -2, -1, 0, 1, 2, 2, 3};
        exists(-2, array);
    }
}
