package Challenges.src;

import java.util.Scanner;

class OddSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to odd sum !!!");
        System.out.print("Enter your number: ");

        int num = input.nextInt();
        int sum = oddSum(num);

        System.out.print("Odd sum till " + num + " is: " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum += i;
            i += 2;
        }

        return sum;
    }
}
