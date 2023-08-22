package Interview_Course.Stack.Stack_Implementation;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            // double the size
            int[] temp = new int[data.length*2];
            //copy the element is temp
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        //if array is not full , inset normally
        return super.push(item);
    }
}
