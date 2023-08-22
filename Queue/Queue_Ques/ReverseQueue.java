package Interview_Course.Queue.Queue_Ques;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

//        reverseQueue(queue);
        reverse_using_recursion(queue);

        System.out.println("printing queue : ");
        while(!queue.isEmpty()){
            int element = queue.peek();
            queue.remove();

            System.out.print(element + " ");
        }
    }

    //using stack
    private static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        //adding queue elements in stack
        while(!queue.isEmpty()){
            int element = queue.peek();
            queue.remove();

            stack.push(element);
        }

        //adding stack element in queue

        while (!stack.isEmpty()){
            int element = stack.peek();
            stack.pop();

            queue.add(element);
        }
    }

    //using Recirsion

    public static void reverse_using_recursion(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int temp = queue.peek();
        queue.remove();
        reverse_using_recursion(queue);
        queue.add(temp);
    }

}
