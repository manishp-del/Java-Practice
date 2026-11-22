package LINKEDLIST;

class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

public class swappingNODEinLL {

    Node head;

    // Swap two nodes
    public void swapNodes(int x, int y) {

        if (x == y) {
            return;
        }

        Node prevX = null, currX = head;

        // Search for node X
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;

        // Search for node Y
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either node is not found
        if (currX == null || currY == null) {
            return;
        }

        // Change previous node links
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Insert node at the beginning
    public void push(int new_data) {

        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    // Print linked list
    public void printList() {

        Node tNode = head;

        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        swappingNODEinLL llist = new swappingNODEinLL();

        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("Linked list before swapping: ");
        llist.printList();

        llist.swapNodes(4, 3);

        System.out.print("Linked list after swapping: ");
        llist.printList();
    }
}
