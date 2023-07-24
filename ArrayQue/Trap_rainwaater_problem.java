package ArrayQue;

public class Trap_rainwaater_problem {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,0,1,3,2};
        int new_ans = rainwater(arr);
        System.out.println(new_ans);
    }
    public static int rainwater(int arr[]){
        int n = arr.length;
        int left_arr[] = new int[n];
        int right_arr[] = new int[n];

        left_arr[0]=arr[0];
        for(int i = 1; i<n;i++){
            left_arr[i]= Math.max(arr[i],left_arr[i-1]);
        }

        right_arr[n-1]=arr[n-1];
        for(int i = n-2; i>=0; i--){
            right_arr[i]= Math.max(right_arr[i+1],arr[i]);
        }

        int ans = 0;
        for(int i = 0; i<n; i++){
            ans += Math.min(left_arr[i],right_arr[i])-arr[i];
        }
        return ans;
    }

}
