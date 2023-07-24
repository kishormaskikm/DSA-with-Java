package recursion;

public class LastZero {

    public static void main(String[] args) {
        int Ans = fact(8);
        lastNon0Digit(Ans);
    }
    static int fact(int N){
        return N*fact(N-1);
    }

    static int lastNon0Digit(int Ans){
        // Code here
        if(Ans%10 != 0){
            return Ans;
        }
        if(Ans%10==0){
            return lastNon0Digit(Ans/10);
        }
        else{
            return  lastNon0Digit(Ans%10);

        }

    }
}
