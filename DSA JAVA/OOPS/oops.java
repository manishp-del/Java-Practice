package OOPS;

public class oops {
    public static void main(String args[]){
        pen p1 = new pen();   //created a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
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
class student{
    String name;
    int age;
    float percentage;   //cgpa
    void calcpercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;

    }

}
