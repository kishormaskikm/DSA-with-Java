package Interview_Course.Binary_Search;


import static java.lang.Math.*;

// find a element in sorted array , but array in inifinite , not allowed to use arr.lenght
public class Infinite_array_search {

    public static void main(String[] args) {
        int[] arr = {2,6,8,10,12,14,25,30,32,36,38,39,40,41,42,45,48,47,50,58,60,100,120,480,1100,1400,1800,2500,3600,8500,47510};
        int ans = infinite_array(arr,8500);
        System.out.println(ans);
    }
    public static int infinite_array(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = start + 1; // this is my newStart
            // double the box value
            // end = previous end + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = temp;

            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }

        // Ensure that 'end' does not exceed the array length
//        end = Math.min(end, arr.length - 1);


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
