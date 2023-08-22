package Interview_Course.Queue.Queue_Ques;

import java.util.LinkedList;
import java.util.Queue;

public class interLeaves_Queue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
//        queue.add(80);

        interLeave(queue);

        System.out.println("printing queue : ");
        while(!queue.isEmpty()){
            int element = queue.peek();
            queue.remove();

            System.out.print(element + " ");
        }
    }

    private static void interLeave(Queue<Integer> queue) {

        if(queue.isEmpty()){
            return;
        }

        int n = queue.size();
        int k = n/2;
        int count = 0;

        Queue<Integer> queue2 = new LinkedList<>();

        // adding half elements in new queue
        while(!queue.isEmpty()){
            int temp = queue.peek();
            queue.remove();
            queue2.add(temp);
            count++;

            if(count == k){
                break;
            }
        }

        // apply interLeaves
        while (!queue.isEmpty() && !queue2.isEmpty()){
            int first = queue2.peek();
            queue2.remove();
            queue.add(first);

            int second = queue.peek();
            queue.remove();
            queue.add(second);
        }

        //odd wala case -> if the given queue is odd then queue2 is always odd so , hence we are appending queue the remaining element is stay at first
        if(n % 2 != 0){
            int temp = queue.peek();
            queue.remove();
            queue.add(temp);
        }
    }
}
