
import java.util.Scanner;
public class arrayex3 {
    public static void main(String[] args){
        int[] marks = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("marks of student 1 is "+marks[0]);
        System.out.println("marks of student 2 is "+marks[1]);
        System.out.println("marks of student 3 is "+marks[2]);
        marks[2] = marks[2] + 10;
        System.out.println("marks of student 3 after adding grace marks is " +marks[2] );
        

        sc.close();
    }
    
}
