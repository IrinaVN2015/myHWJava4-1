package org.example;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 500;
        long actual = service.calculate(1_000_000, false);
        System.out.println(expected + " == ? == " + actual);


    }
}