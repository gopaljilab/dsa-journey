package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 26, 14, 25, 95, 86, 43, 22, 73};

        System.out.print("UnSorted : ");
        for (int number : array) {
            System.out.print(number + " ");
        }

        bubblesort(array);

        System.out.println();
        System.out.print("Sorted :   ");
        for (int number : array) {
            System.out.print(number + " ");
        }

    }

    public static void bubblesort(int[] array) {
        int size = array.length;
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, i, j);
                    swapped = true;
                }
            }
            if (!swapped) break;


        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}
