package recursion;

public class RevPattern {
    public static void main(String[] args) {
        Revpattern(8,0);
    }
    static void Revpattern(int r, int c){

        if(r==0){
            return;
        }
        if(c<r){

            Revpattern(r,c+1);
            System.out.print("*");
        }
        else {
            Revpattern(r-1,0);
            System.out.println();

        }
    }
}
