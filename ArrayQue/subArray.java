package ArrayQue;

public class subArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7};
        printAllSubarrays(arr);
    }
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        //outer loop to select the starting index of the subarray
        for(int i = 0; i < n; i++) {
            //inner loop to select the ending index of the subarray
            for(int j = i; j < n; j++) {
                //print the subarray from index i to j
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

}
