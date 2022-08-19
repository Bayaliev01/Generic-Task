package com;

public class Main {
    public static void main(String[] args) {
        Box<Integer > box = new Box<>(12,20);
        System.out.println(Box.generetic(box));

    }
}