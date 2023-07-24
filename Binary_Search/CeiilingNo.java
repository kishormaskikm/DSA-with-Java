package Interview_Course.Binary_Search;


//return a smallest element in array which is greater than or equal to target elemnet
public class CeiilingNo {
    public static void main(String[] args) {
        int[] arr = {10,12,13,14,15,20,25,30,40};
        int ans = Ceiling_no(arr,41);
        System.out.println(ans);
    }
    private static int Ceiling_no(int[] nums, int target){

        //but what if target is greater than gretest element in array
        if(target > nums[nums.length-1]){
            return -1;   //target is 41
        }

        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            } else{
                return mid;
            }
        }
        return nums[start];
    }

}
