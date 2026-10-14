 package LINKEDLIST;

import java.util.Scanner;

public class removeNTHnode {

    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;

    // Add Last
    public void addlast(int data) {
        node newNode = new node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print LinkedList
    public void print() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Recursive Search
    public int helper(node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    // Reverse LinkedList
    public void reverse() {
        node prev = null;
        node curr = head;
        node next;

        tail = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Remove Nth Node From End
    public void removeNTHnode(int n) {
        if (head == null || n <= 0) {
            System.out.println("Invalid N");
            return;
        }

        // Calculate size
        int size = 0;
        node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n > size) {
            System.out.println("Invalid N");
            return;
        }

        // Remove first node
        if (n == size) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        // Find previous node
        int i = 1;
        int iToFind = size - n;
        node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Update tail if required
        if (prev.next == tail) {
            tail = prev;
        }

        // Remove Nth node from end
        prev.next = prev.next.next;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        removeNTHnode ll = new removeNTHnode();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ll.addlast(data);
        }

        System.out.println("Original LinkedList:");
        ll.print();

        System.out.print("Enter N (from end) to remove: ");
        int k = sc.nextInt();

        ll.removeNTHnode(k);

        System.out.println("Updated LinkedList:");
        ll.print();

        sc.close();
    }
}
