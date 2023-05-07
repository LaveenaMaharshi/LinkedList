package LinkedList;

import java.util.Stack;

public class QueueUsing2Stack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    private void Enqueue(int item) {
        stack1.push(item);
        
    }

    public void Dequeue(){
        if (stack1.size() == 0) {
            System.out.println("Queue is empty");
        } else {
            while (stack1.size() != 1) {
                stack2.push(stack1.pop());
            }
            int last =stack1.pop();
            while (stack2.size() != 0) {
                stack1.push(stack2.pop());
            }
                    System.out.println("Dequeue element is "+ last);
        }
    }

    public static void main(String[] args) {
        QueueUsing2Stack queue1= new QueueUsing2Stack();
        queue1.Enqueue(1);
        queue1.Enqueue(2);
        queue1.Enqueue(3);
        queue1.Enqueue(4);
        queue1.Enqueue(5);
        queue1.Dequeue();
        queue1.Dequeue();

    }
}
