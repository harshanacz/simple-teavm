package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from WASM!");
        String result = add(10, 20);
        System.out.println("10 + 20 = " + result);
    }

    static String add(int a, int b) {
        return String.valueOf(a + b);
    }
}