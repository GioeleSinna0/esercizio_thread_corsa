package com.example;

public class Main {
    public static void main(String[] args) {
        Corridore c1 = new Corridore("A");
        Corridore c2 = new Corridore("B");

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("gara terminata");
    }
}