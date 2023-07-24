package recursion;

import java.util.ArrayList;

public class arrayRecursion {
    public static void main(String[] args) {
        int[] arr = {4,5,2,8,8,9,8,4,4,8};
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(find(arr,8,0,list));
    }
    static ArrayList find(int[] arr , int target, int index ,ArrayList list){
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return find(arr,target,index+1,list);
    }
}
