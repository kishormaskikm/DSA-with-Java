package Interview_Course.Stack.Stack_Implementation;

public class CustomStack {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    int ptr = -1;
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public int pop() throws StackExeptions{
        if(isEmpty()){
            throw new StackExeptions("cannot pop from empty stack");
        }
//        int remove = data[ptr];
//        ptr--;
//        return remove;
        return data[ptr--];
    }
    public int peek() throws StackExeptions{
        if(isEmpty()){
            throw new StackExeptions("cannot get peek from empty stack");
        }
        return data[ptr];
    }


}
