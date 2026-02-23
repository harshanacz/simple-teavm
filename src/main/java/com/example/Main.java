package com.example;

import org.teavm.jso.JSBody;

public class Main {
    public static void main(String[] args) {
        consoleLog("Hello from WASM!");
        String result = add(10, 20);
        consoleLog("10 + 20 = " + result);
    }

    @JSBody(params = {"message"}, script = "console.log(message);")
    private static native void consoleLog(String message);

    static String add(int a, int b) {
        return String.valueOf(a + b);
    }
}