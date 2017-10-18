import java.util.Scanner;

public class MyLinkedList {
    public Node head;

    public static void main(String[] args) throws IOException {
        MyLinkedList mll = new MyLinkedList();
        try (Scanner s = new Scanner(System.in)) {
            mll.append(s.nextInt());
            mll.append(s.nextInt());
            mll.append(s.nextInt());
            mll.append(s.nextInt());
            mll.append(s.nextInt());
            //mll.insertAfter(s.nextInt(), mll.head.next);
            mll.printList();
            System.out.println(mll.getNth(s.nextInt()));
            System.out.println(mll.getMiddleElement(mll.head));
            mll.printList();
            //mll.deleteFirstOccurence(s.nextInt());
            // Node temp = mll.getReverse(mll.head);
            // mll.printList(temp);
            // Node t2 = mll.getReverseRecurrsively(mll.head);
            // mll.printList(t2);
            //mll.deleteDuplicatesForUnsortedLL(mll.head);
            //mll.swapElementPairwise(mll.head);
            mll.printList();
            Node ret = mll.moveLastToFront(mll.head);
            mll.printList();
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void push(int data) {
        Node insertedNode = new Node(data);
        insertedNode.next = head;
        head = insertedNode;
    }

    public void insertAfter(int data, Node prev_node) throws IOException {

        if (prev_node == null) {
            throw new IOException("Previous node cannot be empty.");
        }
        Node insertAfterNode = new Node(data);
        insertAfterNode.next = prev_node.next;
        prev_node.next = insertAfterNode;
    }

    public void append(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        newNode.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public void deleteFirstOccurence(int key) throws IOException {

        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            throw new IOException("Key doesn't exist.");
        }

        prev.next = temp.next;
    }

    public void deleteAtPosition(int position) {

        if (head == null) {
            return;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
        }

        // To find previous
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        Node next = temp.next.next;
        temp.next = next;
    }

    public boolean isPresent(Node head, int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void getUnion(Node head1, Node head2) {

        Node t1 = head1;
        Node t2 = head2;

        while (t1 != null) {
            push(t1.data);
            t1 = t1.next;
        }

        while (t2 != null) {
            if (!isPresent(head, t2.data)) {
                push(t2.data);
            }
            t2 = t2.next;
        }
    }

    public void getIntersection(Node head1, Node head2) {

        Node t1 = head1;

        while (t1 != null) {
            if (isPresent(head2, t1.data)) {
                push(t1.data);
            }
            t1 = t1.next;
        }
    }

    public boolean searchList(Node head, int key) {
        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        return searchList(head.next, key);
    }

    public void swapNode(int x, int y) {

        if (x == y) {
            return;
        }

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        // If x is not the head
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        // If y is not the head
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        //Swap the next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void deleteList() {
        head = null;
    }

    public int getMiddleElement(Node head) {
        Node fast_ptr = head;
        Node slow_ptr = head;

        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
        }
        return slow_ptr.data;
    }

    public int getNth(int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        assert (false);
        return 0;
    }

    public Node getReverse(Node head) throws IOException {
        if (head == null) {
            throw new IOException("Head cannot be null");
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        this.head = prev;
        return prev;
    }

    public void printList(Node head) throws IOException {
        if (head == null) {
            throw new IOException("Head cannot be empty.");
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public Node getReverseRecurrsively(Node head) {
        if (head.next == null) {
            return head;
        }
        Node temp = getReverseRecurrsively(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public int getCount(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public int getNode(Node head1, Node head2) {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;

        if (c1 > c2) {
            d = c1 - c2;
            return getIntersectionPoint(d, head1, head2);
        } else {
            d = c2 - c1;
            return getIntersectionPoint(d, head2, head1);
        }

    }

    public int getIntersectionPoint(int d, Node node1, Node node2) {
        Node curr1 = node1;
        Node curr2 = node2;

        for (int i = 0; i < d; i++) {
            if (curr1 == null) {
                return -1;
            }
            curr1 = curr1.next;
        }

        while (curr1 != null && curr2 != null) {
            if (curr1.data == curr2.data) {
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return -1;
    }

    public void deleteDuplicatesForSortedLL(Node head) {

        if (head == null) {
            return;
        }

        Node curr = head;
        Node nextNext;

        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                nextNext = curr.next.next;
                curr.next = null;
                curr.next = nextNext;
            } else {
                curr = curr.next;
            }
        }
    }

    public void deleteDuplicatesForUnsortedLL(Node head) {
        if (head == null) {
            return;
        }

        Node t1 = head;
        Node t2 = null;
        Node duplicate = null;

        while (t1 != null && t1.next != null) {
            t2 = t1;
            while (t2.next != null) {
                if (t2.data == t2.next.data) {
                    duplicate = t2.next;
                    t2.next = t2.next.next;
                } else {
                    t2 = t2.next;
                }
            }
            t1 = t1.next;
        }
    }

    public void swapElementPairwise(Node head) {

        if (head == null) {
            return;
        }

        Node curr = head;
        while (curr != null && curr.next != null) {
            int k = curr.data;
            curr.data = curr.next.data;
            curr.next.data = k;
            curr = curr.next.next;
        }

    }

    public Node moveLastToFront(Node head) throws IOException {

        if (head == null || head.next == null) {
            throw new IOException("Head is null or head is the only existing node in the linked list.");
        }

        Node last = head;
        Node prev = null;
        while (last.next != null) {
            prev = last;
            last = last.next;
        }

        prev.next = null;
        last.next = head;
        head = last;
        return head;

    }

    public boolean findLoop(Node head) throws IOException {

        if (head == null) {
            throw new IOException("Head is null.");
        }

        Node fast_ptr = head;
        Node slow_ptr = head;

        while (fast_ptr != null && slow_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;

            if (slow_ptr == fast_ptr) {
                return true;
            }
        }
        return false;
    }

    public void deleteAlt(Node head) {
        if (head == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (prev != null && curr != null) {
            prev.next = curr.next;
            curr = null;
            prev = prev.next;
            if (curr != null) {
                curr = prev.next;
            }
        }
    }

    public static class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}