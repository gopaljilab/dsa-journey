package searching;

import java.util.*;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // correct insert position
    }



    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        Arrays.sort(nums);
        System.out.print("nums[] = " + Arrays.toString(nums));
        System.out.println("\t target : " + target);
        int insertIndex = searchInsert(nums, target);
        System.out.println("Insert Index : " + insertIndex);
        int[] numsCopy = new int[nums.length + 1];
        for (int i = 0; i < insertIndex; i++) {
            numsCopy[i] = nums[i];
        }
        // Insert target at insertIndex
        numsCopy[insertIndex] = target;
        // Copy remaining elements
        for (int i = insertIndex; i < nums.length; i++) {
            numsCopy[i + 1] = nums[i];
        }

        System.out.println("Copied Array : " + Arrays.toString(numsCopy));

        System.out.println("------------------------------------------------------------------------------------------------");


        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        if (!list.contains(target)) {
            list.add(target);
            Collections.sort(list);
        }
        System.out.println("After updating the list = " + list);

    }
}


///  High level design  --> Low level design

/**
 *
 *          Data structure                                                          Java (Collection)
 *
 *          Array                                                                   ArrayList
 *          Dynamic Array
 *          LinkedList [Single, Doubly, Circular]                                   LinkedList
 *          Stack [push, pop, top]                                                  Stack
 *          Queue [NQueue, DQueue]                                                  Queue
 *          Tree  []                                                                TreeSet/TreeMap
 *          Graph [DFS, BFS, ]                                                      Map
 *          Sorting                                                                 Sorting
 *          Searching                                                               Searching
 *

 */
