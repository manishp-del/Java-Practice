package OOPS;

public class hierarchialinheritance {
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.walk();
        dobby.legs = 4;
        System.out.println("Dog has " + dobby.legs + " legs");

    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
        
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}
class Dog extends Mammals{
    String breed;
}
