import java.util.Scanner;

public class MyDLL {

    Node head;

    public static void main(String[] args) throws IOException {
        MyDLL dll = new MyDLL();
        try (Scanner s = new Scanner(System.in)) {
            dll.append(s.nextInt());
        }
    }

    public void push(int data) {
        Node node = new Node(data);
        node.prev = null;
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertAfter(Node prevNode, int data) throws IOException {

        if (prevNode == null) {
            throw new IOException("prevNode cannot be empty.");
        }

        Node node = new Node(data);
        node.next = prevNode.next;
        prevNode.next = node;
        node.prev = prevNode;

        if (node != null) {
            node.next.prev = node;
        }
    }

    public void append(int data) {
        Node node = new Node(data);
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void deleteNode(Node head, Node del) throws IOException {
        if (head == null) {
            throw new IOException("Head cannot be null");
        }

        if (del == head) {
            head = del.next;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }

        if (del.prev != null) {
            del.prev.next = del.next;
        }
    }

    public Node getReverse(Node head) throws IOException {
        if (head == null) {
            throw new IOException("Head cannot be null");
        }
        Node temp = null;
        Node curr = head;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public static class Node {
        Node prev, next;
        int data;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }
}