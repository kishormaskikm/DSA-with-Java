package recursion;

public class maze {
    public static void main(String[] args) {
        int ans = count(4,4);
        System.out.println(ans);
        mazepath("",3,3);
    }
    static int count(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
       int count =  count(r-1,c) + count(r,c-1);
        return count;

    }
    static void mazepath(String p,int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
            mazepath(p+'D',r-1,c);
        }
        if(c>1){
            mazepath(p+'R',r,c-1);
        }

    }
}
