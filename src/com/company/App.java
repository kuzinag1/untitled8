package com.company;

public class App {
    public static void main(String[] args) {
        Dog dog = Dog.newBuilder()
                .withColorSkin("grey")
                .withAge(3)
                .build();
        System.out.println(dog);
    }
}
