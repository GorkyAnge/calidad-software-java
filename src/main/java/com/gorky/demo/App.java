package com.gorky.demo;

public class App { // bad class name style removed, but keep other issues
    public static void main(String[] args) {
        ConversorUnidades.main(args); // bad class name usage removed, keep intentional bugs
        int x = 1/0; // division by zero bug
    }
}
