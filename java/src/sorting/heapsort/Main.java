package sorting.heapsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= {4,10,3,5,1};
        Heap heap = new Heap();
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("After sorting ....");
        heap.heapSort(arr);
        System.out.println("arr : " + Arrays.toString(arr));
    }
}
