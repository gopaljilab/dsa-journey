package sorting;

public class BubbleSortClient {
    public static void main(String[] args) {
        int[] array = {12, 26, 14, 25, 95, 86, 43, 22, 73};
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = {42};
        int[] array4 = {};

        testcases(array);
        testcases(array1);
        testcases(array2);
        testcases(array3);
        testcases(array4);

    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static void testcases(int[] array){
        System.out.print("Unsorted: ");
        printArray(array);

        BubbleSort.bubblesort(array); // ✅ Calling method from BubbleSort class

        System.out.println();
        System.out.print("Sorted:   ");
        printArray(array);
        System.out.println();
    }
}
