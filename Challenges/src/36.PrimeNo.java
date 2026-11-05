package Challenges.src;

import java.util.Scanner;

class PrimeNo {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Prime no checker : ");
        System.out.println("Enter your number : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("Your number is prime.");
        }else {
            System.out.println("Your number is not prime");
        }

    }
    public static boolean isPrime (int num){
        int i = 2;
        while(i < num){
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
