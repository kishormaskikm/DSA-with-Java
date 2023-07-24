package Interview_Course.Binary_Search;

public class Painter_partition {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int ans = PainterPartition(arr,2);
        System.out.println(ans);
    }
    public static int getMax(int arr[],int n){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getSum(int arr[],int n){
        int total = 0;

        for(int i = 0; i<n ; i++){
            if(arr[i]>total){
                total += arr[i];
            }
        }
        return total;
    }

    private static int PainterPartition(int[] arr,int k){
        int lo = getMax(arr,arr.length);
        int hi = getSum(arr , arr.length);
        int ans = 0;
        while (lo < hi) {
            //mid represent here a maximum sum of any sub array
            int mid = lo + (hi - lo) /2;

            //no sub array has sum greater than mid value

            if(good(arr,mid,k)){
                ans = mid;
                hi= mid -1;
            }else{
                lo = mid + 1;
            }

        }
        return ans;

    }

    private static boolean good(int[] arr, int mid , int k){
        int total = 0;
        int numPainters = 1;

        for(int i =0; i<arr.length; i++){
            total += arr[i];

            if(total > mid){
                numPainters++;
                total = arr[i];
            }
        }

        if(numPainters <= k){
            return true;
        }else{
            return false;
        }
    }


}

