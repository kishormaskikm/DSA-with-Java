package ArrayQue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseGroupARR {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(5,3,1,2,9,5,0,7)
        );
        reverseInGroups(arr,2,3);



    }
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        List<Integer> head = arr.subList(0, k);
        List<Integer> tail = arr.subList(k, arr.size()-1);
        System.out.println(head);
        System.out.println(tail);

    }
    static void Reverse(int[] arr) {

        int temp = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
