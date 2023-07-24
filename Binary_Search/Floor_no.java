
package Interview_Course.Binary_Search;


//return a gretest element in array which is smaller than or equal to target elemnet
public class Floor_no {
    public static void main(String[] args) {
        int[] arr = {10,12,13,14,15,20,25,30,40};
        int ans = floor_no(arr,24);
        System.out.println(ans);
    }
    private static int floor_no(int[] nums, int target){

        //but what if target is smaller than smallest element in array
        if(target < nums[0]) {
            return -1; //target is 9
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
        return nums[end];
    }

}
