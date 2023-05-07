// LinkedListackage LinkedList;

import java.util.*;

// define constructor where queues will be implemented using linkedlist

// create a method top()which will return the element on the top (last element)

class Stack2Queue {
    // create two queues using built in class queues
    // Constructor doesn't have return type, it is access modifier
    private Queue<Integer> Q1;
    private Queue<Integer> Q2;
    private int size = 0;

    // define constructor where queues will be implemented using linkedlist
    public Stack2Queue() {
        Q1 = new LinkedList<Integer>();// Using built in LinkedList class
        Q2 = new LinkedList<Integer>();
    }

    // create method push where we need to push the element in the linkedlist ,no
    // change in logic as queues will also push elements from the top
    private void push(int item) {
        Q1.add(item);
        size++;
    }

    // create method pop where the deletion need to be from the end ,so implement a
    // loop till we are left with last element and remove the elements from first
    // queue and push them on second queue,
    // after that remove the last element from first queue
    // push all the elements back to queue1.
    public int pop() {
        if (size == 0) {
            return -1;
        } else {
            while (Q1.size() != 1) {
                Q2.add(Q1.remove());// remove()- removes the value from the Linked list
            }
            int last = Q1.remove();

            while (Q2.size() != 0) {
                Q1.add(Q2.remove());
            }
            size--;
            return last;
        }
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int top() {
        // Implement the top() function
        if (Q1.isEmpty()) {
            return -1;
        }
        while (Q1.size() != 1) {
            Q2.add(Q1.remove());
        }
        int top = Q1.peek();
        Q2.add(Q1.remove());

        Queue<Integer> q = Q1;
        Q1 = Q2;
        Q2 = q;
        return top;
    }

    public static void main(String[] args) {
        Stack2Queue stackObj= new Stack2Queue();
        stackObj.push(5);
        stackObj.push(6);
        stackObj.push(7);
        stackObj.push(8);
        stackObj.push(9);
        // System.out.println(stackObj.pop());

    }
}