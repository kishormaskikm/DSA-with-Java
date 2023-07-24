package Interview_Course.Binary_Search;

public class Check_sqr {
    public static void main(String[] args) {
        int ans = chech_srq(16);
        System.out.println(ans);
    }
    private static int chech_srq(int x) {
        int lo = 0;
        int hi = x;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo;
    }


}
