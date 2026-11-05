package Challenges.src;

import java.util.Scanner;

class SumOfDigits {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to digit identifier !");
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        int sum = sumOFDigit(num);

        System.out.print("Your sum of digits is : " + sum);
    }

    public static int sumOFDigit(int num){
        int sum = 0;
        while ( num > 0){
            sum = sum + (num % 10) ;
            num = num /10 ;
        }

        return sum;
    }
}
