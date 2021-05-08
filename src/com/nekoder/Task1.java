package com.nekoder;

public class Task1 {
    public static void count(int number) {
        if (number > 1)
            count(number - 1);
        System.out.println(number);
    }
}
