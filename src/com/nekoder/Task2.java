package com.nekoder;

public class Task2 {
    public static void printFullAddress(String address) {
        System.out.println(
                address.replaceAll("\\bAve\\.*\\b", "Avenue")
                        .replaceAll("\\bStr?\\.*\\b", "Street")
                        .replaceAll("Street\\.", "Street")
                        .replaceAll("Avenue\\.", "Avenue")
        );
    }
}
