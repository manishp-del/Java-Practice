package LINKEDLIST;

import java.util.Scanner;

public class reverse {

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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        reverse ll = new reverse();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ll.addlast(data);
        }

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        System.out.println("LinkedList:");
        ll.print();

        int indexb = ll.recsearch(key);

        if (indexb == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + indexb);
        }

        ll.reverse();
        System.out.println("Reversed LinkedList:");

        System.out.println("LinkedList:");
        ll.print();
    }
}
