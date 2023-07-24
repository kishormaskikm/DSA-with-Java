package ArrayQue;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {10,20,5,30,40,100};
        Reverse(arr);
    }
    static void Reverse(int[] arr){
        int temp=0;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
