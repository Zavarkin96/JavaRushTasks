package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    /*public static void reverseArray(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        for (int i = 0; i < array.length/2; i++) {
            int itter = array.length -1;
            array[i] = array[itter - i];
            //array[array.length - i - 1] = itter;
        }
    }*/
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
