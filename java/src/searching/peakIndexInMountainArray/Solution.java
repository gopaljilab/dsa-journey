package searching.peakIndexInMountainArray;

public class Solution {
    public static int isPeakIndex(int[] arr){
//        int peakIndex = 0;
//        int index = 0;
//        while(arr.length != 0){
//            if(arr[index] < arr[index + 1]){
//                index++;
//            }else {
//                peakIndex = index;
//                break;
//            }
//        }
//        return peakIndex;

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid+1]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
