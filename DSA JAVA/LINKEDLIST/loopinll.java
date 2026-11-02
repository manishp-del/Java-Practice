package LINKEDLIST;
import java.util.*;
//Floyd's Cycle Detection Algorithm
public class loopinll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    //floyd cycle detection
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast){
                return true; //cycle exists
            }
        }
        return false; //cycle doesn't exist
    }
    public static void main(String args[]){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head = first;
        first.next = second;
        second.next = third;
        third.next = second; //cycle created
        if(isCycle()){
            System.out.println("Cycle exists");
        }else{
            System.out.println("Cycle doesn't exist");
        }

    }


    
}
