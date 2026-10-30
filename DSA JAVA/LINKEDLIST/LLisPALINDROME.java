package LINKEDLIST;

import java.util.Scanner;

public class LLisPALINDROME {

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

    // Add Last
    public void addlast(int data) {
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
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Recursive Search
    public int helper(Node head, int key) {
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

    public int search(int key) {
        return helper(head, key);
    }

    // Remove Nth Node from End
    public void removenthnode(int n) {

        if (head == null || n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        // Calculate size
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n > size) {
            System.out.println("Invalid Input");
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

        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Remove node
        if (prev.next == tail) {
            tail = prev;
        }

        prev.next = prev.next.next;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        LLisPALINDROME ll = new LLisPALINDROME();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ll.addlast(data);
        }

        System.out.println("Original LL:");
        ll.print();

        System.out.print("Enter n from end to remove: ");
        int k = sc.nextInt();

        ll.removenthnode(k);

        System.out.println("Updated LL:");
        ll.print();

        sc.close();
    }
}