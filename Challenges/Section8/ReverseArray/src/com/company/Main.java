package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array before being reversed:" + Arrays.toString(originalArray));
        reverseArray(originalArray);
        System.out.println("Array after being reversed:" + Arrays.toString(originalArray));
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int firstNumber = array[i];
            int secondNumber = array[array.length - (i + 1)];
            array[i] = secondNumber;
            array [array.length - (i + 1)] = firstNumber;
        }
    }
}
