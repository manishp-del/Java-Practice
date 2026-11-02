package LINKEDLIST;
import java.util.*;
public class floydCycle {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    //add last
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;

    }
    //find node at given position 
    public static Node getNode(int pos){
        Node temp = head;
        for(int i=1; i<pos && temp != null; i++){
            temp = temp.next;
        }
        return temp;
    }
    //floyd cycle detection
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;  //1
            fast = fast.next.next;  //2
            if(slow == fast){
                return true;
            }


        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            int data = sc.nextInt();
            addLast(data);
        }   
        System.out.print("Enter loop position (0 for no loop): ");
        int pos = sc.nextInt();
        if(pos >= 1 && pos <= n){
            Node loopNode = getNode(pos);
            tail.next = loopNode;
        }
        else if(pos != 0){
            System.out.println("Invalid position. No loop created.");
            sc.close();
            return;
        }
        if(isCycle()){
                System.out.println("Cycle exists");
            }
            else{
                System.out.println("Cycle doesn't exist");
            }
        }
    }
    

