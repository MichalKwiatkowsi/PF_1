package org.example;

public class SquareDifferences {
    public static void main(String[] args) {
        int sumOfSquares= 0;
        int squareOfSum= 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }

        squareOfSum *= squareOfSum;

        int difference = squareOfSum - sumOfSquares;

        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Square of sum: " + squareOfSum);
        System.out.println("Difference: " + difference);
    }
}