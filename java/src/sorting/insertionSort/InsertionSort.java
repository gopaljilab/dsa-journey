package sorting.insertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {12,11,13,5,6};
        System.out.print("Unsorted : ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Sorted : ");
        int[] sortedArray = inertionSort(arr);
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }

    public static int[] inertionSort(int[] arr){
        int key,j;

        for (int i=1;i< arr.length;i++){
            key = arr[i];
            j = i-1;
            while ((j >= 0) && (arr[j] > key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr;
    }
}

