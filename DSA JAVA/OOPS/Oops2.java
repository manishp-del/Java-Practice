package OOPS;
import java.util.*;


public class Oops2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        pen p1 = new pen();   //created a pen object called p1
        System.out.print("enter pen color : ");
        String color = sc.next();
        System.out.print("enter pen tip size: ");
        int tip = sc.nextInt();
        p1.setcolor(color);
        p1.setTip(tip);
        System.out.println("\npen details: ");
        System.out.println("color = " + p1.color);
        System.out.print("tip = " +p1.tip);
        sc.close();
    }
    
}
class pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color = newcolor;

    }
    void setTip(int newTip){
        tip = newTip;

    }
}
