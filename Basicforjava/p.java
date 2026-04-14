package Basicforjava;

import java.util.Scanner;
public class sumof {
    public static void printhelloworld(){
        System.out.println("hello world");
    }
    

    
}
public static void sumof(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("sum is :" + sum);
}
public static void main(String args[]){
    sumof();
}