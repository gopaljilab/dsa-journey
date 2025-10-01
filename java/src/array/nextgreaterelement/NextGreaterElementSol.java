package array.nextgreaterelement;

public class NextGreaterElementSol {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int greater = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (target == nums2[j]){
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > target){
                            greater = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            result[index++] = greater;
        }
        return result;
    }
}
