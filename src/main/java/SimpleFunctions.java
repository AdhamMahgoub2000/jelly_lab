package com.example;

public class SimpleFunctions {
    public String sayHello(String name) {
        return "Hello " + name + " !";
    }

    public boolean EvenNumber(int num) {
        return (num % 2 == 0);
    }

    public String Capital(String name) {
        String first = name.substring(0, 1);
        name = name.substring(1);
        String capital_first = first.toUpperCase();
        return capital_first + name;

    }
}
