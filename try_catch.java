package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Calculate(8));
    }

    public static int Calculate(int number) {
        if (number == 1) {
            return 1;
        }
        return Calculate(number - 1) * number; // Just debugging the code
    }
}
