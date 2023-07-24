package ArrayQue;

public class TwoEqualArr {
    public static void main(String[] args) {
        int A[] = {2,5,8,9,6,3};
        int B[] = {8,5,2,6,9,3};
        boolean ans = check_equal(A,B);
        System.out.println(ans);
    }
    static boolean check_equal(int A[],int B[]){
        int sum1 = 0;
        int  sum2 = 0;
        for(int i=0; i<A.length; i++){
            sum1 = sum1+ A[i];
        }
        for(int j=0; j<B.length; j++){
            sum2 = sum2+ B[j];
        }
        if(A.length==B.length && sum1==sum2){
            return true;
        }
        else {
            return false;
        }
//        this output is not true for every case
    }
}
