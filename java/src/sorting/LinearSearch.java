package sorting;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = getInputList();
        long startTime = System.nanoTime();
        for(int i = 0; i < 1; i++) {
            linearSearch(arr);
        }

        long endTime = System.nanoTime();
        System.out.println("Total time taken by the linear search " + (endTime - startTime));

        System.out.println("-------------------------------------------------------------------");

    }

    private static void linearSearch(int[] arr) {
        int target = 200;
        int finded = 0;
        int position = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (target == arr[i]) {
                finded = 1;
                position = i + 1;
                break;
            }
        }
        if (finded == 1) {
            System.out.println("Element is found at " + position);
        } else {
            System.out.println("Element not is found");
        }
    }

    private static int[] getInputList() {
        int size = 10_000_0001; // 1 crore elements
        int[] inputArray = new int[size];
        for (int i = 0; i < size - 1; i++) {
            inputArray[i] = new Random().nextInt(100);
        }
        inputArray[size-1] = 200;
        return inputArray;
    }



}
