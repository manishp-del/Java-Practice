package LINKEDLIST;

import java.util.Scanner;

public class LLisPALINDROME2 {

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

    // Print Linked List
    public void print() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Step 1: Find Middle
    public node findmid(node head) {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Step 2: Reverse Linked List
    public node reverse(node head) {
        node prev = null;
        node curr = head;

        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Step 3: Check Palindrome
    public boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        // Find Middle
        node mid = findmid(head);

        // Reverse Second Half
        node right = reverse(mid);
        node left = head;

        // Compare both halves
        while (right != null) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        LLisPALINDROME2 ll = new LLisPALINDROME2();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ll.addlast(data);
        }

        System.out.println("Original Linked List:");
        ll.print();

        if (ll.isPalindrome()) {
            System.out.println("Linked List is Palindrome");
        } else {
            System.out.println("Linked List is not Palindrome");
        }

        sc.close();
    }
}