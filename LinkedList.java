package LinkedList;

class Node {
    public Object value;
    public Node next; // Creating a Structure of a Node.
}

class Llist {
    int size;
    Node head;

    public void lList() {
        this.size = 0;
        this.head = null;
    }

    public void insertNode(int item) {
        Node n1 = new Node();
        n1.value = item;

        Node currNode = this.head;
        // Insert Node at the Head
        if (this.head == null) {
            this.head = n1;
            this.head.next = null;// Because no other nodes are available
            this.size = 1;// Size is increased by 1 since 1 node is inserted
        }
        // Insert Node at the Tail
        else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = n1;
            n1.next = null;
            this.size += 1;
        }
    }

    public void insertMiddleNode(int item, int position) {
        Node n1 = new Node();
        n1.value = item;

        Node currNode = this.head;

        if (this.head != null && position <= this.size) {
            for (int i = 1; i < position; i++) {
                currNode = currNode.next;
            }
            n1.next = currNode.next;
            currNode.next = n1;
            this.size += 1;
        }
    }

    public void insertStartNode(int item) {
        Node n1 = new Node();
        n1.value = item;

        n1.next = this.head;
        this.head = n1;
        this.size += 1;

    }

    public void deletionAtEnd() {
        Node prevNode = null;
        Node currentNode = this.head;
        while (currentNode.next != null) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        // Previous Node pointing to second last node and current pointing to last node
        prevNode.next = null;
        this.size -= 1;
    }

    public void deleteAtStart() {
        if (this.head != null) {
            this.head = this.head.next;
            this.size -= 1;
        } else {
            System.out.println("Cannot Delete Node from an Empty Linked List........");
        }
    }

    public void deleteAnyPosition(int position) {
        if (position <= this.size && this.head != null) {
            Node currNode = this.head;
            Node prevNode = null;

            for (int i = 1; i < position; i++) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            prevNode.next = currNode.next;
            this.size -= 1;
        } else {
            System.out.println("Unable to delete at this Position......");
        }
    }

    public void printLinkedList() {
        Node currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.value);
            currNode = currNode.next;
        }
    }
}

public class linkedList {
    public static void main(String[] args) {
        Llist ll = new Llist();

        ll.insertStartNode(5);
        ll.insertStartNode(4);
        ll.insertStartNode(8);

        ll.insertMiddleNode(10, 2);

        ll.insertNode(1);
        ll.printLinkedList();
    }
}
