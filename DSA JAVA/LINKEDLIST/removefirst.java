package LINKEDLIST;

public class removefirst{
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
    if(idx == 0) {
        addfirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
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
public int removefirst(){
    if(size == 0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;

    }
    else if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}

public static void main(String args[]){
    removefirst ll = new removefirst();

    ll.addfirst(2);
    ll.addfirst(1);
    ll.addfirst(3);
    ll.addfirst(4);
    ll.add(1, 9);
    ll.print();
    System.out.println(ll.size);
    ll.removefirst();
    ll.print();


}
}