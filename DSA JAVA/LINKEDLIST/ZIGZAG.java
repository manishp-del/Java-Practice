
package LINKEDLIST;

public class ZIGZAG {

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
    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print LinkedList
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Zig Zag LinkedList
    public void zigzag() {

        // Step 1: Find Middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Step 2: Reverse Second Half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Alternate Merge
        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        while (left != null && right != null) {

            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

        // Update Tail
        tail = head;

        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    // Main Method
    public static void main(String args[]) {

        ZIGZAG ll = new ZIGZAG();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        System.out.println("Original LinkedList:");
        ll.print();

        ll.zigzag();

        System.out.println("Zig Zag LinkedList:");
        ll.print();
    }
}






