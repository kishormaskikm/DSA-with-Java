package Interview_Course.Min_Max_Algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class Agressive_cow {
    public static void main(String[] args) {
        int n = 5;
        int c = 3;
        int[] arr = {1,2,4,8,9};

        int ans = distributeCow(arr,c,n);
        System.out.println(ans);
    }

    private static int distributeCow(int[] arr, int c, int n) {
        Arrays.sort(arr);

        int start = 0;

        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i],max);
        }
        int end = max;

//        int end = arr[arr.length - 1] - arr[0];

        int ans = 0;

        while (start <= end ){
            // mid represents Minimum distance between two cows
            int mid = (start+end)/2;

            if(isGood(arr,c,n,mid)){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    private static boolean isGood(int[] arr, int n, int c , int mid){
        int count = 1;
        int last_pos = arr[0];

        for(int i =1; i<arr.length; i++){
            if(arr[i]-last_pos >= mid){ // thats not we want
                last_pos = arr[i];
                count++;
            }
            if(count >= c){  //all cows must inserted
                return true;
            }

        }
        return false;
    }

}
