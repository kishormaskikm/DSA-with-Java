package ArrayQue;

public class missiing_Num {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,6,10,3,7,8};
        int n = arr.length;
        int ans = missing_num(arr,9);
        System.out.println(ans);
    }
    static int missing_num(int[] arr,int n){
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++){
            sum -= arr[i];
        }
        return sum;
    }

}
