package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        multiArray = new int[n][];

        for ( int i = 0; i < multiArray.length; i++){
            int size = scanner.nextInt();//Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
}