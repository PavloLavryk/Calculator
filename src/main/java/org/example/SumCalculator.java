package org.example;


public class SumCalculator {
    public int sum(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        return (n * (n + 1)) / 2;

    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            SumCalculator calculator = new SumCalculator();
            int result = calculator.sum(n);
            System.out.println("The sum from 1 to " + n + " is " + result);
        } else {
            System.out.println("Please provide a number as an argument.");
        }
    }
}

