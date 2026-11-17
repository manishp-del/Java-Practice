package LINKEDLIST;

public class IntersectionLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Find Intersection
    public static Node getIntersectionNode(Node headA, Node headB) {

        Node tempA = headA;
        Node tempB = headB;

        while (tempA != tempB) {

            if (tempA == null) {
                tempA = headB;
            } else {
                tempA = tempA.next;
            }

            if (tempB == null) {
                tempB = headA;
            } else {
                tempB = tempB.next;
            }
        }

        return tempA;
    }

    public static void main(String args[]) {

        // First LinkedList
        Node headA = new Node(10);
        headA.next = new Node(20);

        // Common nodes
        Node common = new Node(30);
        common.next = new Node(40);
        common.next.next = new Node(50);

        // Connect first list
        headA.next.next = common;

        // Second LinkedList
        Node headB = new Node(5);
        headB.next = new Node(15);

        // Connect second list to common node
        headB.next.next = common;

        // Find Intersection
        Node intersection = getIntersectionNode(headA, headB);

        if (intersection == null) {
            System.out.println("No Intersection Found");
        } else {
            System.out.println("Intersection at node: " + intersection.data);
        }
    }
}