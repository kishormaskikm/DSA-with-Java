package ArrayQue;


public class largest_sum_subarray {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-2,-5};
        int n = arr.length;
        int ans = largest_sum(arr,n);
        System.out.println(ans);
    }

    static int largest_sum(int[] arr, int n){
        int currentSum = 0;
        int mazSum =  Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            currentSum = currentSum + arr[i];
            if(currentSum>mazSum){
                mazSum = currentSum;
            }
            if(currentSum<0){
                currentSum =0;
            }
        }
        return mazSum;
    }

}
