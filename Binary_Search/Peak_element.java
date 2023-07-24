package Interview_Course.Binary_Search;

public class Peak_element {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = findPeakElement(nums); // return index value expected
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;

        while (lo < hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>nums[mid+1]){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }
}
