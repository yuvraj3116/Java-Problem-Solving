package Challenges.src;

import java.util.Scanner;

class MuliplicatonTable {
   public static void main() {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Multiplication World !!.");
       System.out.println("Please enter your number : ");
       int num = input.nextInt();
       printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num){
       int i = 1;
       while (i <= 10){
           System.out.println(num + " X " + i + " = " + (num * i));
           i++;
       }
    }
}
