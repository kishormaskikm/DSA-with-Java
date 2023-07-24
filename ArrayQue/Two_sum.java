package ArrayQue;

public class Two_sum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int[] ans = {};
        ans= twoSum(nums,target);
        System.out.println(ans);
    }
    public static int[] twoSum(int[] nums, int target) {
        // iterate through the array to check each pair of elements
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // check if the sum of the two elements equals the target
                if (nums[i] + nums[j] == target) {
                    // if it does, return the indices of the two elements
                    return new int[] { i, j };
                }
            }
        }
        // if no two elements add up to the target, return an empty array
        return new int[] {};
    }

}
