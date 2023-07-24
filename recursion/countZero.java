package recursion;

public class countZero {
    public static void main(String[] args) {
        System.out.println(countZero(210004105));
    }
    static int countZero(int n){
        return helper(n , 0);
    }
    public static int helper(int n , int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);
    }


}
