package Interview_Course.Stack.Stack_Que;

import java.util.Stack;

public class next_smaller_ele {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};

        int[] res = nse(arr);

        for (int nums : res) {
            System.out.println(nums);
        }
    }

    private static int[] nse(int[] arr) {
        int n = arr.length;
        int output[] = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i =1 ; i< n; i++){

            while(!st.empty() && arr[i] <= arr[st.peek()]){
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

        return output;

    }
}
