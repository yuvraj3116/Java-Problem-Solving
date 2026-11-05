package Challenges.src;

import java.util.Scanner;

class LCM {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to LCM!");
        System.out.print("Enter your first number : ");
        int first = input.nextInt();
        System.out.print("Enter your second number : ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.print("LCM of the two numbers is : " + lcm);
    }


    public static int lcm(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
        return 0; // unreachable
    }
}