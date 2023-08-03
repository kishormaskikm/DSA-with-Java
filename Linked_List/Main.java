package Interview_Course.Linked_List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(40);
        list.insertFirst(65);
        list.insertLast(90);
        list.display();
        list.insertRecursion(300,2);
        list.display();

//        DLL  list = new DLL();
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(40);
//        list.insertFirst(65);
//
//        list.display();

    }
}
