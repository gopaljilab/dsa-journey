package array.nextgreaterelement;

import java.util.Arrays;

public class NextGreaterElementMain {
    public static void main(String[] args) {
        NextGreaterElementSol sol = new NextGreaterElementSol();
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        System.out.println("Input: nums1 = " + Arrays.toString(nums1)
                + " , nums2 = " + Arrays.toString(nums2));

        NextGreaterElementSol elementSol = new NextGreaterElementSol();
        int[] result = elementSol.nextGreaterElement(nums1, nums2);
        System.out.println("Output : " + Arrays.toString(result));
    }
}
