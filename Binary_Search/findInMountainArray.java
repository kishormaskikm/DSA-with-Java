package Interview_Course.Binary_Search;

public class findInMountainArray {

    public int findInMountainArray(int target, int[] arr) {
        int Peak = findPeakElement(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target,0,Peak);
        if(firstTry != -1){
            return firstTry;
        }
        int secondTry = orderAgnosticBinarySearch(arr,target,Peak+1,arr.length-1);
        return secondTry;
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
    static int orderAgnosticBinarySearch(int[] arr, int target , int start , int end) {

        // Check the order of the array
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // If the element is not found, return -1
        return -1;
    }
}
