package searching;

import java.util.Scanner;

public class IsSquareNumberClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        Math.sqrt(16);
        int num = input.nextInt();
        IsSquareNumber square = new IsSquareNumber();
        boolean isSquare = IsSquareNumber.isSquareNum(num);
        System.out.print("Is Square? : " + isSquare);
    }
}
