package com.timothy_g;

public class Division {

    public static void main(String[] args) {

        int numerator = 74985;
        int denominator = 3;
        boolean flag = false;
        int answer =1;

        while (!flag) {
            if (denominator == 0) {
                flag = true;
                System.out.println("Division by zero, not allowed");
            }

            if (answer * denominator > numerator) {
                int remainder = (numerator - ((answer - 1) * denominator));
                System.out.println(numerator + " divided by " + denominator + " equals " + (answer - 1) + " with a remainder of " + remainder);
                flag = true;
            } else if (answer * denominator == numerator) {
                int remainder = 0;
                System.out.println(numerator + " divided by " + denominator + " equals " + (answer) + " with a remainder of " + remainder);
                flag = true;
            } else {
                answer++;
            }

        }

    }
}
