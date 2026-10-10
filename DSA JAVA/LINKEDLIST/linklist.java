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
public static int size;

//methods
public void addfirst(int data){
    size++;
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
    size++;
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
    System.out.println("null");

}
public void add(int idx, int data){
    Node newNode = new Node(data);
    Node temp = head;
    int i=0;
    while(i<idx-1){
        temp = temp.next;
        i++;
        
    }
    //i = idx-1;  temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;

}

public static void main(String args[]){
    linklist ll = new linklist();

    ll.addfirst(2);
    ll.addfirst(1);
    ll.addfirst(3);
    ll.addfirst(4);
    ll.add(1, 9);
    ll.print();


}
}