package Interview_Course.Stack.Stack_Implementation;

public class mainStack {
    public static void main(String[] args) throws StackExeptions{
        DynamicStack stack = new DynamicStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(12);
        stack.push(100);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
