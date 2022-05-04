package com.company;

import java.util.Scanner;

public class OnSuch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Эгер varargs колдонсонуз анда методко каалаганча аргумент берсениз болот.
        someMethod("Tynchtyk", "Madina","Timur","Adilet");
        method2(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
    }
    static void someMethod(String...arg){
        System.out.println(arg.length);
    }
    static void method2(int...var){
        for (int i = 0; i <var.length ; i++) {

        System.out.print(var[i]+" ");
        }
        System.out.println("\n["+var.length+"]");
    }
}
