package Interview_Course.Binary_Search;

import java.util.Arrays;

// we have a matrix and which is sorted row and column wise , find out element in it
public class Search_2D_array {
    public static void main(String[] args) {
        int[][] sortedArray = {
                {1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}
        };
        System.out.println(Arrays.toString(search(sortedArray,3)));
    }
    private static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[] {r ,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
        return new int[] {-1 ,-1};

    }
}
