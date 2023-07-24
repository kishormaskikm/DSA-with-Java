package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,44,54,74,88,92};
        int target = 900;
        System.out.println(Search(arr,target,0,arr.length-1));
    }

    public static int Search(int [] arr, int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = start +(end - start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if(target < arr[mid]){
            return Search(arr , target , start , mid-1);
        }
        else {
            return Search(arr, target , start+1, end);
        }
    }

}
