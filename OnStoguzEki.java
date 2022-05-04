package com.company;

import java.util.Scanner;

public class OnStoguzEki {
    public static void main(String[] args) {
        System.out.println(method(44, 56, 77, 89, 92, 12, 13, 21, 12, 34, 45, 56));
    }
    static boolean method(int num1, int num2, int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (num1 == numbers[i] || num2 == numbers[i]) {
                return true;
            } else {
            }
        }
        return false;
    }
}


