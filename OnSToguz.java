package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class OnSToguz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(method(new int[]{13, 24, 55, 122, 73, 36, 21}, 23, 34, 45, 56, 67, 78, 35, 12, 21));
    }
    static boolean method(int[] number, int... numbers) {
        for (int a : number) {
         //   System.out.println();
            for (int i = 0; i < numbers.length; i++) {
                if (a == numbers[i]) {
                    return true;
                } else {
                    //return false;
                }
            }
        }
            return false;
    }
}
