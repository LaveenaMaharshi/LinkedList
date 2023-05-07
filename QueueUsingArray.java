package LinkedList;

import java.util.Arrays;

public class QueueUsingArray {
    public Object[] arr1; //As we dont know which datatype we are using.
    private int index;
    private int front=0;

    public QueueUsingArray(int size){
        arr1= new Object[size];
        index= -1; // using negative indexing for last value in an array if we use size-1, it will always be on the last position and print stack is full.
    }

    @Override
    public String toString() {
        return Arrays.toString(arr1);
        
    }
    public void Push(Object value) {
        if(index==arr1.length-1){
            System.out.println("Stack is full, can't insert more value");
        }
        else{
        index++;
        arr1[index]=value;
        }
    }

    public void Pop() {
        if(front==arr1.length-1){
            System.out.println("Stack is Empty , cannot remove");
        }
        else{
            arr1[front]=null;
            front++;
           // return arr1[oldTop];
        }
        
    }

    public static void main(String[] args) {
        QueueUsingArray s1= new QueueUsingArray(5);
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