package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));

        int max=array[0];
        int f;
        for (int i=0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
            for (int i=0; i<array.length; i++){
                if (array[i] == max) {
                    array[i] = 0;
                }
        }
       max=array[0];
        for (int i=0; i<array.length; i++){
            if (array[i]>max){
                max=array[i];
            }
        }

        System.out.println("Второй по величине элемент в массиве "+max);

    }
}
