package OOPS;

public class methodOVERRIDING {
    Deer d = new Deer;
    d.eat();
    
}
class  Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
