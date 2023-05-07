package StacksAndQueues;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(9);
        stack1.push(7);
        stack1.push(5);
        stack1.push(5);
        stack1.push(6);

        System.out.println(stack1);

        stack1.pop();
        System.out.println(stack1);

        // See the top element using method peek()
        System.out.println("Top Element is: " + stack1.peek());

        // Search whether the element is present in the stack or not
        System.out.println(stack1.search(10));
        System.out.println(stack1.search(9));

        System.out.println(stack1.empty());
    }
}
