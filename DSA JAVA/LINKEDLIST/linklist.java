
package LINKEDLIST;

public class linklist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        
  
    }
}   
public static Node head;
public static Node tail;

//methods
public void addfirst(int data){
    //step1 = create new node
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    

    //step 2 newnode next = head
    newNode.next = head; //link
    //step3 head = newNode
    head = newNode;
}
public static void addlast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;

    }
    tail.next = newNode;
    tail = newNode;

}
public void print(){
    if(head == null){
        System.out.println("ll is empty");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data +"->");
        temp = temp.next;
    }
    System.out.println();

}

public static void main(String args[]){
    linklist ll = new linklist();
    ll.print();
    ll.addfirst(2);
    ll.print();
    ll.addfirst(1);
    ll.print();
    ll.addfirst(3);
    ll.print();
    ll.addfirst(4);
    ll.print();


}
}