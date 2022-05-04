package com.company;

public class OnSbir {
    public static void main(String[] args) {
method(1,2,3,4,5,6,7,8,9,10);
    }
    static void method(int...values){
        int counter = 0;
        for(int i =0; i< values.length; i++){
            counter+=values[i];
        }
        System.out.println(counter);
    }
}
