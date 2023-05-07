package LinkedList;

import java.util.Arrays;

public class StackUsingArray {
    public Object[] arr1; //As we dont know which datatype we are using.
    private int top;

    public StackUsingArray(int size){
        arr1= new Object[size];
        top= -1; // using negative indexing for last value in an array if we use size-1, it will always be on the last position and print stack is full.
    }

    @Override
    public String toString() {
        return Arrays.toString(arr1);
        
    }
    public void Push(Object value) {
        if(top==arr1.length-1){
            System.out.println("Stack is full, can't insert more value");
        }
        else{
        top++;
        arr1[top]=value;
        }
    }

    public void Pop() {
        if(top==-1){
            System.out.println("Stack is Empty , cannot remove");
        }
        else{
            int oldTop=top;
            top--;
           // return arr1[oldTop];
            arr1[oldTop]=null;
        }
        
    }

    public static void main(String[] args) {
        StackUsingArray s1= new StackUsingArray(5);
        s1.Push(10);   
        s1.Push(20);     
        s1.Push(30);     
        s1.Push(40);     
        s1.Push(50);     
        System.out.println(s1.toString());    
        s1.Pop();
        System.out.println(s1.toString());
    }
}
