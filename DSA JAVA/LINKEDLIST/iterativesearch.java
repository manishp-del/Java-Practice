package LINKEDLIST;

import java.util.Scanner;

public class iterativesearch {

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

    // Iterative Search
    public int search(int key) {
        node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        iterativesearch ll = new iterativesearch();

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

        int indexb = ll.search(key);

        if (indexb == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + indexb);
        }

        sc.close();
    }
}