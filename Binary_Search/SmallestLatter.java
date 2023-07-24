package Interview_Course.Binary_Search;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLatter {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(target < letters[mid]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length]; // that return the actual start value if it is in array and if it is not then return first elemnt in arra (wraap up condition)

    }
}
