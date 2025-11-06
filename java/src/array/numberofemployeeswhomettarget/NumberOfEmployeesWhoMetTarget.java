package array.numberofemployeeswhomettarget;

public class NumberOfEmployeesWhoMetTarget {
    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int resultIndex = 0;
        for (int k : order) {
            for (int friend : friends) {
                if (k == friend) {
                    result[resultIndex] = k;
                    resultIndex++;
                }
            }
        }
        return result;
    }
}
