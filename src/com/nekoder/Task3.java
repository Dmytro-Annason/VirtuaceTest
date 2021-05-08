package com.nekoder;

public class Task3 {
    public static void printCurrentColor(double time) {
        time=time%5;
        if(time>=4)
            System.out.println("red");
        else if(time>=3)
            System.out.println("yellow");
        else
            System.out.println("green");
    }
}
