package com.nekoder;

public class Task2 {
    public static void printFullAddress(String address) {
        System.out.println(
                address.replaceAll("\\bAve\\.?,", "Avenue,")
                        .replaceAll("\\bStr?\\.?,", "Street,")
        );
    }
}
