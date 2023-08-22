package Interview_Course.Queue.Queue_Implementation;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue MyQueue = new CircularQueue(5);

        MyQueue.insert(2);
        MyQueue.insert(22);
        MyQueue.insert(41);
        MyQueue.insert(7);
        MyQueue.insert(4);
        MyQueue.display();

        System.out.println(MyQueue.remove());
        MyQueue.insert(100);
        MyQueue.display();
    }


}
