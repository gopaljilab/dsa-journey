package sorting;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = getInputList();

        long startTime = System.nanoTime();
        Arrays.sort(arr);
        /*for(int i = 0; i < 1; i++) {
            binarySearch(arr);
        }*/
        long endTime = System.nanoTime();
        System.out.println("Total time taken by the Binary search " + (endTime - startTime));
    }

    private static void binarySearch(int[] arr) {
        int target = 200;

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                found = true;
                System.out.println("Element found at index: " + mid);
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
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
