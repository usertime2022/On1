package com.company;

import java.util.Locale;
import java.util.Scanner;

public class OnPsegiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   System.out.print("Соз жазыныз: ");
        System.out.print(method(scanner.nextLine()));
    }
    static String method(String soz) {
     //   Scanner scanner = new Scanner(System.in);
     // System.out.print("Кайсы тамгадан кесип кайтарсын: ");
        String a = "а";
        if (soz.contains(a)) {
            int b = soz.indexOf('а');
            //System.out.println(soz.charAt(a));
            return soz.substring(0, b).toUpperCase().trim();
        }else{
            return "Жок";
        }
    }
}





