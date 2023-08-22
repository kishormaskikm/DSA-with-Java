package Interview_Course.Stack.Stack_Que;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first ;
    private Stack<Integer> second ;
    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void insert(int item){
        first.push(item);
    }
    public int remove(){
        while (!first.empty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.empty()){
            first.push(second.pop());
        }
        return removed;
    }
    //for finding peek in a stack , removed element is always peek thats why we copy same code and insted of remove just returned
    public int peek() throws Exception{
        while (!first.empty()){
            second.push(first.pop());
        }
        int top_ele = second.peek();
        while (!second.empty()){
            first.push(second.pop());
        }
        return top_ele;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

}


