package Interview_Course.Stack.Stack_Que;

import java.util.Arrays;
import java.util.Stack;

public class Prev_greater_ele {
    public static void main(String[] args) {
        int[] arr = {1,21,3,4,3,8}; // reverse this input and pass to NGE for find PGE
        Reverse(arr);
        int[] res = pge(arr);

        for (int nums : res) {
            System.out.println(nums);
        }

    }

    private static int[] pge(int[] arr) {
        int n = arr.length;
        int output[] = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i =1 ; i< n; i++){

            while(!st.empty() && arr[i] > arr[st.peek()]){
                output[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int top_indx = st.peek();
            output[top_indx] = -1;
            st.pop();
        }
        Reverse(output);
        return output;
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
    }

}
