package recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ans = fabo(7);
        System.out.println(ans);
    }
    public static  int fabo(int n){
        if(n<2){
            return n;
        }

        return fabo(n-1)+fabo(n-2);
    }


}