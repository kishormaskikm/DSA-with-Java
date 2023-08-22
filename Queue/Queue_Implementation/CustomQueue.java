package Interview_Course.Queue.Queue_Implementation;
import java.util.*;
public class CustomQueue {
    protected int[] data ;
    int end = 0;
    private static final int DEFAULT_SIZE = 10;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty..!");
        }
        int removed =  data[0];
        //shifting the element toward start
        for (int i = 1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty..!");
        }
        int front = data[0];
        return front;
    }
    public void display(){
        for (int i=0; i<end; i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.print("END");
    }



}
