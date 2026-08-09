import java.util.*;
public class TOWERofHANOI {
    public static void towerofhanoi(int n, char source, char helper, char destination){
        //base case
        if(n==1){
            System.out.println("move disc 1 from" + source + "to" + destination);
            return;
        }
        //move n-1 disks from source to helper
        towerofhanoi(n-1, source, destination, helper);
        //move n-1 disk from helper to destination
        System.out.println("move disk"+n+ "from" +  source + "to"+ destination);
        //move n-1 disks from helper to destination
        towerofhanoi(n-1, helper, source, destination);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int n = sc.nextInt();
        towerofhanoi(n, 'A', 'B', 'C');
        sc.close();

    }
    
}
