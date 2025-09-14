package Patterns;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] gopal) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows or columns you want to print?  ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
