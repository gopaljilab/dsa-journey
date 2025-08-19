package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IsSquareNumberClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        IsSquareNumber square = new IsSquareNumber();
        boolean isSquare = IsSquareNumber.isSquareNum(num);
        System.out.print("Is Square? : " + isSquare);
    }
}
