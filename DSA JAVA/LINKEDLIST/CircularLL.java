
package LINKEDLIST;

public class CircularLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    // Add Last
    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // Print Circular LinkedList
    public void print() {

        if (head == null) {
            System.out.println("Circular LinkedList is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    // Remove First
    public int removeFirst() {

        if (head == null) {
            System.out.println("CLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (head == tail) {
            head = tail = null;
            size--;
            return val;
        }

        head = head.next;
        tail.next = head;
        size--;

        return val;
    }

    // Remove Last
    public int removeLast() {

        if (head == null) {
            System.out.println("CLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;

        if (head == tail) {
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = head;
        size--;

        return val;
    }

    // Main Method
    public static void main(String args[]) {

        CircularLL ll = new CircularLL();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Circular LinkedList:");
        ll.print();

        System.out.println("Size: " + size);

        System.out.println("Removed First: " + ll.removeFirst());
        System.out.println("Removed Last: " + ll.removeLast());

        System.out.println("Updated LinkedList:");
        ll.print();

        System.out.println("Size: " + size);
    }
}
