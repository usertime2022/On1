package com.company;

import java.util.Locale;

public class OnSjeti {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.toUpperCase());
        System.out.println("Hello".toUpperCase());
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(4)+""+a.charAt(3)+""+a.charAt(2)+""+a.charAt(1)+""+a.charAt(0));
        char b = a.charAt(0);
        System.out.println(b);
        // saptyn bir bolugun kesip kaitarat
        String c = "Hello world!";
        System.out.println(c.substring(6));
        System.out.println(c.substring(3));
        System.out.println(c.substring(3,8));
        System.out.println(c.substring(0,5));
        String d = c.substring(0,7);
        System.out.println(d);
        // contains kamtyiby kamtybaiby teksheret
        String cont = "hello";
        System.out.println(a.contains(cont));
        // equals sozdordu biri birine salyshtyryp teksheret
        String eq = "HelLo woRld!";
        System.out.println(c.equals(eq));
        System.out.println(c.equalsIgnoreCase(eq)); // chon tamga kichine tamga karabai salyshtyrat
        // replace
        System.out.println(a.replace("o","a"));
        System.out.println(eq.replace("woRld!","mir"));
        // length razmeri kancha eseptep beret
        System.out.println(eq.length());
        // concat soz koshot
        System.out.println(eq.concat(" Timur"));
    }
}
