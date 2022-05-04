package com.company;

public class OnSbesh {
    public static void main(String[] args) {
        int[]array={12,23,34,45,56,67,78,89,90,10};
        for (int a : array){
            //форичтин ичине каалагандай код жахсак болот
            System.out.println("\n"+a+",");
            for (int i = 1; i <= 10; i++) {
                System.out.print(a*i+",");
            }
        }
    }
}
