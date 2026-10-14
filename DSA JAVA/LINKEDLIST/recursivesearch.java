package LINKEDLIST;

import java.util.Scanner;

public class recursivesearch {
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
    public int helper(Node head, int key){
        if(head == null){
            return -1;

        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;

        }
        return idx+1;

    }
    public int recsearch(int key){
        return helper(head, key);


    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        recursivesearch ll = new recursivesearch();

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

        sc.close();
    }
    
}
