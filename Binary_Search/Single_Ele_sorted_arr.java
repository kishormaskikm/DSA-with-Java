package Interview_Course.Binary_Search;

public class Single_Ele_sorted_arr {
    public static void main(String[] args) {
        System.out.println("hello DSA ");
        int[] arr = {2,2,4,5,5,6,6,8,8,10,10};
        int ans2 = Single_element(arr);
        System.out.println(ans2);

        //2nd solutuon

        int[] nums = {2,2,5,5,6,6,8,8,3,10,10};
        int newAns = singleNonDuplicate(nums);
        System.out.println(newAns);
    }

    // for time complexity O(n)
    public static int Single_element(int[] arr){
        int ans=0;
        for (int i = 0;  i<arr.length; i++){
            if(arr[i]==arr[i+1]){
                i++;
            }else{
                ans = arr[i];
            }
        }
        return ans;

    }

    // for time complexity O(log n)
    public static int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int high = nums.length-1;

        while(lo<high){
            int mid = lo + (high-lo)/2;
            boolean halvseAreEven = (high - mid) % 2 ==0;

            if(nums[mid]==nums[mid+1]){
                if(halvseAreEven){
                    lo = mid+2;

                }else{
                    high = mid - 1;
                }
            } else if (nums[mid]==nums[mid-1]) {
                if(halvseAreEven){
                    high = mid- 2;
                }else {
                    lo = mid + 1;
                }
            }
            else {
                return nums[mid];
            }
        }
        return nums[lo];
    }
}
