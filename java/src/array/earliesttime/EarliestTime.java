package array.earliesttime;

public class EarliestTime {
    public static int earliestTime(int[][] tasks) {
        int earliestTime = Integer.MAX_VALUE;
        for (int[] task : tasks) {
            int sumOfTime = 0;
            for (int j = 0; j < tasks[0].length; j++) {
                sumOfTime += task[j];
            }
            if (sumOfTime < earliestTime)
                earliestTime = sumOfTime;
        }
        return earliestTime;
    }
}
