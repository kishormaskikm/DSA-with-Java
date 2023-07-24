package recursion;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class seriesNum {
    public static void main(String[] args) {
        System.out.println(printSeries(5,3));
    }
//    public static List<Integer> printSeries(int n, int k) {
//        // Write your code here
//        ArrayList<Integer> list = new ArrayList<>();
//        if(n>0){
//            int ans = n-k;
//            list.add(ans);
//            printSeries(ans ,k);
//        }
//        else {
//            int ans2 = n+k;
//            list.add(ans2);
//            printSeries(ans2 , k);
//        }

    public static List<Integer> printSeries(int n, int k) {

        // Declare an empty array to store our series
        List<Integer> answer = new ArrayList<>();

        // Call the series function
        series(n, k, answer);

        // Return the answer
        return answer;
    }

    private static void series(int n, int k, @NotNull List<Integer> answer) {

        // Add n to answer
        answer.add(n);

        // If n<=0 then break the recursion
        if (n <= 0) {
            return;
        }

        // Recur for series(answer, n, n-k).
        series(n - k, k, answer);

        // Add n to answer.
        answer.add(n);
    }


}
