// package StacksAndQueues;

// import java.util.LinkedList;
import java.util.Queue;

public class StacksUsingTwoQueues {
    // create two queues using built in class queues
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size = 0;

    // define constructor where queues will be implemented using linkedlist
    // Constructors doesn't have return type rather it is with access modifiers
    public StacksUsingTwoQueues() {
        q1 = new java.util.LinkedList<Integer>(); // In-built Linked List Class
        q2 = new java.util.LinkedList<Integer>(); // In-built Linked List Class
    }

    // create method push where we need to push the element in the linkedlist, no
    // change in logic as queues will also push elements from the top
    public void push(int item) {
        q1.add(item);
        size++;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        } else {
            while (q1.size() != 1) {
                q2.add(q1.remove());
            }
            int last = q1.remove();
            while (q2.size() != 0) {
                q1.add(q2.remove());
            }
            size--;
            return last;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int top() {
        // Implement the top() function
        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return top;
    }

    public static void main(String[] args) {
        StacksUsingTwoQueues stackNew = new StacksUsingTwoQueues();

        stackNew.push(5);
        stackNew.push(6);
        stackNew.push(7);
        stackNew.push(10);
        stackNew.push(9);
        // System.out.println(stackNew.pop());
        System.out.println(stackNew.top());
        stackNew.pop();
        System.out.println(stackNew.top());
    }
}
