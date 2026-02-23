package main.java.com.example;

import org.teavm.jso.browser.Window;

public class Main {
    public static void main(String[] args) {
        Window.alert("Hello from WASM!");
        System.out.println("TeaVM is working");
    }
}