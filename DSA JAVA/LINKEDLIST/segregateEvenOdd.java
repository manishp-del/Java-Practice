package LINKEDLIST;

class Solution {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Segregate even and odd nodes
    void segregateEvenOdd() {

        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null) {
            end = end.next;
        }

        Node new_end = end;

        // Move odd nodes from the beginning to the end
        while (curr.data % 2 != 0 && curr != end) {

            new_end.next = curr;
            curr = curr.next;

            new_end.next.next = null;
            new_end = new_end.next;
        }

        // If current node is even
        if (curr.data % 2 == 0) {

            head = curr;

            while (curr != end) {

                if (curr.data % 2 == 0) {

                    prev = curr;
                    curr = curr.next;

                } else {

                    prev.next = curr.next;
                    curr.next = null;

                    new_end.next = curr;
                    new_end = curr;

                    curr = prev.next;
                }
            }

        } else {
            prev = curr;
        }

        // Move the last odd node to the end
        if (new_end != end && end.data % 2 != 0) {

            prev.next = end.next;
            end.next = null;

            new_end.next = end;
        }
    }

    // Insert node at the beginning
    void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Print linked list
    void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Main method
    public static void main(String args[]) {

        Solution llist = new Solution();

        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(4);
        llist.push(2);
        llist.push(0);

        System.out.println("Linked List:");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Updated Linked List:");
        llist.printList();
    }
}
