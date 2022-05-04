package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	method(1,2,3,4,5,6,7);
    }
    static void method(int...values){
        System.out.println(values[3]);
        System.out.println(Arrays.toString(values));
    }
}
