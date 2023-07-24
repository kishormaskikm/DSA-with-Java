package Interview_Course.Binary_Search;

public class orderAgnosticBinarySearch {

    public static void main(String[] args) {
        // Example usage
        int[] arrAscending = { 1, 3, 5, 7, 9, 11, 13 };
        int[] arrDescending = { 13, 11, 9, 7, 5, 3, 1 };

        int target = 7;
        int indexAscending = orderAgnosticBinarySearch(arrAscending, target);
        int indexDescending = orderAgnosticBinarySearch(arrDescending, target);

        System.out.println("Ascending Array:");
        System.out.println("Index of " + target + " is: " + indexAscending);

        System.out.println("Descending Array:");
        System.out.println("Index of " + target + " is: " + indexDescending);
    }

    // Function to perform Order Agnostic Binary Search
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
