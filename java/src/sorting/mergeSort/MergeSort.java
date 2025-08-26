package sorting.mergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int num : arr) {       // for printing array
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return; // base case

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);        //sort left Half
        mergeSort(arr, mid + 1, high);  // sort right half
        merge(arr, low, mid, high);        // merge halves
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; //temporary array
        int left = low;
        int right = mid + 1;
        int k = 0;

        // Merge elements from both halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy sorted temp back to original array
        System.arraycopy(temp, 0, arr, low, temp.length);
    }
}
