package com.company;

public class OnEki {
    // Методдоун параметрине varargs берип аргументтерин массив менен берип консольго чыгарсак да болот
    public static void main(String[] args) {
method(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
    static void method(int...values){
        int count =0;
        for (int i = 0; i < values.length; i++) {
            count+=values[i];
        }
        System.out.println(count);
    }
}
