package ArrayQue;

public class Mejority_Element {
    public static void main(String[] args) {
        int[] myArr={40,40,30,30,40,40};
        int ans =Mejority_element(myArr,5);
        System.out.println(ans);
    }
    static int Mejority_element(int[] arr , int n){
        int AnsIdx = arr[0];
        int count =1;

        for(int i=1; i< arr.length; i++){
            if(arr[i]==AnsIdx){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                AnsIdx = arr[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++){
            if (arr[i] == AnsIdx)
                count++;

        }

        if (count > n/2){
            return AnsIdx;
        }
        return -1;

    }
}


