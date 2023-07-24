package Interview_Course.Interval_Based_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = mergeIntervals(intervals);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        // Sort the intervals based on their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                // Overlapping intervals, update the end time of the current interval
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // Non-overlapping interval, add the current interval to the result list
                result.add(currentInterval);
                currentInterval = intervals[i];
            }
        }

        // Add the last interval to the result list
        result.add(currentInterval);

        // Convert the list to a 2D array and return
        return result.toArray(new int[result.size()][]);
    }
}