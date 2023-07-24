package Interview_Course.Binary_Search;

public class Rotation_count {
    //find the no of count of how many times array is rotated
    public static void main(String[] args) {
        int[] nums = {8,9,10,15,2,3,6};
        int ans = rotation_count(nums);
        System.out.println(ans);
    }

    public static int rotation_count(int[] arr){
        int pivot = findPivot(arr);
        int count  = 0;

        if(pivot == arr.length-1){
            return count;
        }else{
            return pivot + 1 ;
        }

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
