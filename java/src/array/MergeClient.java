package array;

import java.util.Arrays;

public class MergeClient {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        Merge.merge(nums1, m, nums2, n);  // nums1 is updated in-place
        System.out.println(Arrays.toString(nums1));
    }
}
