package Challenges.src;

import java.util.Scanner;

class GCD {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to GCD !");

        System.out.print("Enter your first number : ");
        int first = input.nextInt();

        System.out.print("Enter yoour second number : ");
        int second = input.nextInt();

        int gcd = gcd(first,second);

        System.out.println("GCD of the given numbers is : " + gcd);

    }

    public static int gcd(int first, int second){
        int gcd = 1;
        int i = 2;
        int least = least(first,second);
        while ( i <= least){
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if (num1 < num2){
            return num1;
        }else {
            return num2;
        }
    }
}
