package LINKEDLIST;
import java.util.*;
public class removeLOOP {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static void removecycle(){
        //detect cycle
        Node slow = head;
        Node fast =  head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;

            }
        }
        if(cycle == false){
            return;
        }
        //find melting point
        slow = head;
        Node prev = null;   //last node
        while(slow != fast){
            prev  = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node[] arr = new Node[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = new Node(sc.nextInt());

            if (i > 0) {
                arr[i - 1].next = arr[i];
            }
        }

        if (n > 0) {
            head = arr[0];
        }

        System.out.print("Enter position to create loop (-1 for no loop): ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < n) {
            arr[n - 1].next = arr[pos];
        }

        removecycle();

        System.out.println("Updated Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
    }


    

