package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i+1];
            for (int j = 0; j <= i ; j++) {
                result[i][j] = i+j;
                System.out.print(j + i + " ");
            }
            System.out.println("");
        }
    }
}