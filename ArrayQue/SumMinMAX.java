package ArrayQue;

public class SumMinMAX {
    public static void main(String[] args) {
        int[] arr = {20,30,50,10,20,100,5};
        int ans =findSum(arr,5);
        System.out.println(ans);
    }

    public static int findSum(int A[],int N)
    {
        int max = 0;
        int min =A[0];
        for(int i =0 ; i<A.length; i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }
        return max+min;
    }
}
