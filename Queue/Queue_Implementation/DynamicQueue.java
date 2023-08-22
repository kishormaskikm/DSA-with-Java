package Interview_Course.Queue.Queue_Implementation;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            // double the size
            int[] temp = new int[data.length*2];
            //copy the element is temp
            for(int i = 0; i < data.length; i++){
                temp[i] = data[(front + i) % data.length];
            }
            int front = 0;
            int end = data.length;
            data = temp;
        }

        return super.insert(item);
    }
}
