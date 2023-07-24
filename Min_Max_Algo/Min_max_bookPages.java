package Interview_Course.Min_Max_Algo;

public class Min_max_bookPages {

    public static void main(String[] args) {
        int m = 2;
        int[] pages = {12,34,67,90};
        int new_ans = Min_pages(pages,m);
        System.out.println(new_ans);
    }
    public static int Min_pages(int[] arr, int m){

        int max = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i],max);
            sum += arr[i];

        }
        //for finfing search space we calculate sum and max
        int start = max;  // if each student read at least one book , and we have to retrun out Max then then maximum in array is a ans
        int end = sum;     //if one single student can read all books then max is sum of all element

        int ans = 0;

        while(start <= end){

            //mid represents maximun no pages read by student
            int mid = (start + end) /2;

            if(isGood(arr ,mid , m )){  //if isGood is true means -> ans is lies between left side
                ans = mid;
                end = mid -1;
            }else{
                start = mid + 1; // if fasle -> ans is lies in right side
            }
        }

        return ans;
    }

    private static boolean isGood(int[] arr, int mid, int m) {
        int sum = 0;
        int studentNo = 1;
        for(int i = 0; i<arr.length; i ++){
            if(arr[i] > mid){
                return false;
            }
            if(arr[i] + sum > mid){
                studentNo++;
                sum = arr[i];
                if(studentNo > m){
                    return false;
                }
            }else {
                sum += arr[i];
            }
        }
        return true;
    }
}
