package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(testExampre(4,0));
    }

    private static int testExampre(Integer a, Integer b) {
        int test = 0;
        try {
            test = a / b;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!!!");
        }
        return test;
    }
}

