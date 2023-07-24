package Interview_Course.Interval_Based_sorting;

import java.util.Arrays;
import java.util.Comparator;
//sorting 2D array of size 2 ,based on first elemnt of array
public class Sorte_2D_arr {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        // Sort the 2D array based on the first element of each subarray
        Arrays.sort(twoDArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        // Print the sorted 2D array
        for (int[] arr : twoDArray) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
