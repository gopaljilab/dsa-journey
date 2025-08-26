package sorting.quickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int[] result = quickSort(arr, 0, arr.length - 1);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] quickSort(int[] arr, int low, int high){
        if (low < high) {
            int partitionIndex = partition(arr, low, high); // Get pivot index
            quickSort(arr, low, partitionIndex - 1);        // Sort left side
            quickSort(arr, partitionIndex + 1, high);       // Sort right side
        }
        return arr;
    }

    public static int partition(int[] arr,int low, int high){
        int pivot = arr[low];
        int left = low;
        int right = high;

        while (left<right){
            while (arr[left]<=pivot && left<=high-1){
                left++;
            }
            while (arr[right]>pivot && right>=low+1){
                right--;
            }
            if (left<right) swap(arr,left,right);
        }
        swap(arr,low,right);
        return right;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
