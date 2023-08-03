package Interview_Course.Linked_List;

public class LL {
    private int size;
    private Node head;
    private Node tail ;
    LL(){
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");

    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Que - 1) insert node via linkedList
    public void insertRecursion(int val, int index){
        head = insertRec(val,index,head);
    }
    public Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRec(val,index-1,node.next);
        return node;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node find(int val){
        Node node = head;
        while (head != null){
            if(head.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        public Node(int value){
            this.value = value;
        }
    }
//    <---------------------- Questions ------------------->
    // Que - 2) remove duplicates in sorted linked list
    public void removeDuplicate(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    // Que - 3) merge two sorted list
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null){
            if(f.value <= s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }
    //Que - 4 ) cycle or Two Pointer method
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    // Que - 5 ) lenth of the cycle
    public int CycleLength(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                int length=0;
                do{
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // Que - 6 ) return starting point of cycle

    public Node detectCycle(Node head) {
        int lenght = 0;
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                lenght = CycleLength(slow);
            }
        }
        if(lenght == 0){
            return null;
        }
        //find the start node
        Node f = head;
        Node s = head;
        while (lenght > 0){
            s = s.next;
            lenght--;
        }

        //keep moving both forward by 1 , by they will meet at cycle start
        while (s != f){
            f = f.next;
            s = s.next;
        }
        return s;

    }
    //Que - 7) Happy Number , https://leetcode.com/problems/happy-number/

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast)); // move 2x by slow
        }while (slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }
    public int findSquare(int number){
        int ans = 0;
        while (number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    // Que - 8) return middel value of linked list  -> //https://leetcode.com/problems/middle-of-the-linked-list/
    public Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Que - 9) Bubble sort in Linked list
    public void Bubblesort(){
        Bubblesort(size-1,0);
    }
    public void Bubblesort(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            Node first = get(col);
            Node second = get(col+1);

            //swap

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            Bubblesort(row,col+1);
        }else {
            Bubblesort(row-1,0);
        }
    }
    //Que 10) Reverse a linkedlist using Recursion
    private void Reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        Reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    // que 11)In-place reverse - Ittrative approch for reverse linked list (No tail provided0)
    private void Reverse_list(){
        if(size < 2){
            return;
        }
        //initially
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head =prev;

    }

    // Reverse but not return head node
    private Node Reverse_returnHead(Node head){
        if(size < 2){
            return head;
        }
        //initially
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head =prev;
        return head;

    }
    // one more for reverse list
    // https://leetcode.com/problems/reverse-linked-list/submissions/
    // google, apple, amazon, microsoft
    public Node reverseList(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    //Que 12) check weather the linkedList palindrome or not
    public boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node headSecond = Reverse_returnHead(mid);
        Node reverseHead = headSecond;

        //compare both the halves
        while (head != null && headSecond != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        Reverse(reverseHead);
        return head == null || headSecond == null;
    }


    // que 13) -> Reorder the linked list
    public void reorderList(Node head){
        if(head ==null && head.next ==null){
            return;
        }
        Node mid = middleNode(head);

        Node hs = reverseList(mid);
        Node hf = head;

        //re-arreage
        while (hf != null && hs !=null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        // nect of tail to null
        if(hf != null){
            hf.next = null;
        }
    }

    // que 14) -> Intersection of two linked list
    public Node getIntersectionNode(Node headA, Node headB) {
        int L1 = findLength(headA);
        int L2 = findLength(headB);

        // Align the pointers to the same relative position
        while (L1 > L2) {
            headA = headA.next;
            L1--;
        }
        while (L2 > L1) {
            headB = headB.next;
            L2--;
        }

        // Now both pointers are at the same relative position
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA; // Intersection point found
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection point found
    }

    public int findLength(Node start) {
        int count = 0;
        while (start != null) {
            count++;
            start = start.next;
        }
        return count;
    }

    // Que 15) -> Odd Even Linked List
    //https://leetcode.com/problems/odd-even-linked-list/
    public Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node h1 = head;
        Node h2 = head.next;
        Node t1 = h1;
        Node t2 = h2;

        Node current = h2.next;
        boolean isOdd = true;

        while (current != null) {
            if (isOdd) {
                t1.next = current;
                t1 = current;
            } else {
                t2.next = current;
                t2 = current;
            }

            current = current.next;
            isOdd = !isOdd;
        }

        // Connect even list to the end of odd list
        t1.next = h2;
        // Set evenTail's next to null to mark the end of the merged list
        t2.next = null;

        return h1;
    }
    // Google, Microsoft, Facebook: https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }


    // google, amazon, facebook, microsoft: https://leetcode.com/problems/reverse-nodes-in-k-group/
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }

    public int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    //Que 14 ) Copy list with random poinnter
    // https://leetcode.com/problems/copy-list-with-random-pointer/


    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node ptr = head;

        while(ptr != null){
            //clone node
            Node newNode = new Node(ptr.value);
            // connect them
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }
        //connect a random pointers
        ptr = head;

        while(ptr != null){
//            ptr.next.random = (ptr.random != null )? ptr.random.next : null; comented beacause of random is leet code variable
            ptr = ptr.next.next;
        }

        //seprate a list and connect them

        Node ptr_old_list = head;
        Node ptr_new_list = head.next;
        Node head_new = head.next;

        while(ptr_old_list != null){
            ptr_old_list.next = ptr_old_list.next.next;
            ptr_new_list.next =(ptr_new_list.next != null)? ptr_new_list.next.next: null;

            //move both pointers
            ptr_old_list = ptr_old_list.next;
            ptr_new_list = ptr_new_list.next;
        }
        return head_new;
    }

    //que - 15 )

    public int pairSum(Node head) {
        Node mid = findMid(head);
        Node h1 = head;
        Node h2 = mid.next;
        reverseList(h2);
        int ans = 0;

        while(h1 == mid && h2 == null){
            int newans = h1.value + h2.value;
            h1 = h1.next;
            h2 = h2.next;
            ans = Math.max(ans , newans);
        }
        return ans;

    }
    public Node findMid(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }






    public static void main(String[] args) {

        //for merge problem
//        LL ans = new LL();
//        LL first = new LL();
//        LL second = new LL();
//
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);
//
//        ans = merge(first,second);
//        ans.display();



    }
    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
