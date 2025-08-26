package sorting.bubbleSort;

public class BubbleSort {
    public static void bubblesort(int[] array) {
        int size = array.length;
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) break;


        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

