package LINKEDLIST;

public class removelast {

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
    public void addfirst(int data) {
        size++;

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public static void addlast(int data) {
        size++;

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print Linked List
    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Add at index
    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove First
    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

    // Remove Last
    public int removelast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev: second-last node
        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public static void main(String args[]) {
        removelast ll = new removelast();

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(3);
        ll.addfirst(4);

        ll.add(1, 9);

        ll.print();
        System.out.println(ll.size);

        ll.removefirst();
        ll.print();

        ll.removelast();
        ll.print();

        System.out.println(ll.size);
    }
}
