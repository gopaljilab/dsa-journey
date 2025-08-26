package sorting.selectionSort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int arrayLength = input.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("Enter the "+arrayLength+" Elements : ");
        for (int element=0; element<arrayLength;element++){
            arr[element] = input.nextInt();
        }
        int[] sortedArray = selectionSort(arr,arrayLength);
        System.out.println();
        System.out.println("Sorted Elements : ");
        for (int value:sortedArray){
            System.out.print(value+" ");
        }
    }

    public static int[] selectionSort(int[] arr,int arrLength){
        for (int i=0; i<=arrLength-2; i++){
            int min = i;
            for (int j=i+1; j<=arrLength-1;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
