package math.uglyNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ugly Number Checker");
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        System.out.println("isUgly : " + Solution.calculateUgly(num));
    }

}