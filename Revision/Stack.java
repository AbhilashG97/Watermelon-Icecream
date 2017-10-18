import java.util.Scanner;

public class Stack {
    Scanner s;
    private int size;
    private int top = -1;
    private int[] stack;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        s = new Scanner(System.in);
    }

    public void push(int num) {
        if (top + 1 < size) {
            top++;
            stack[top] = num;
        } else {
            System.out.println("Stack is full !");
        }
    }

    public void pushAll() {
        if ((top + 1) < size) {
            for (int i = (top + 1), j = 0; i < size; i++) {
                stack[i] = s.nextInt();
                top++;
            }
        } else {
            System.out.println("Stack is full !");
        }
    }

    public void pop() {
        if (top >= 0) {
            stack[top] = -1;
            top--;
        } else {
            System.out.println("Stack is already empty !");
        }
    }

    public void popAll() {
        if (top > 0) {
            for (int i = top; i > 0; i--) {
                stack[i] = -1;
                top--;
            }
        } else {
            System.out.println("Stack is empty !");
        }
    }

    public int peek() {
        return stack[top];
    }

    public void displayAll() {
        System.out.println("\n--------------------------------------------");
        if (top >= 0) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Stack is empty !");
        }
    }
}