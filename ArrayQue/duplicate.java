package ArrayQue;

public class duplicate {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(FindDupli(arr));
    }
    static boolean FindDupli(int[] arr){
        boolean ans = false;
        for(int i =0; i<arr.length;i++){
            int temp = arr[i];
            for(int j=0; j<arr.length;j++){
                if(temp==arr[j]){
                    ans = true;

                }
            }
        }
        return ans;

    }

}
