package searching.countPairs;

import java.util.*;

import static searching.countPairs.Solution.calculateCountPairs;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the list: ");
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter the integers for the list:");
        for (int i = 0; i < numElements; i++) {
            nums.add(scanner.nextInt());
        }
        System.out.print("Enter the target : ");
        int target = scanner.nextInt();
        System.out.println("Input : " + nums);
        System.out.println("Target : " + target);
        int pairs  = calculateCountPairs(nums,target);
        System.out.println("OutPut : " + pairs);
    }
}
