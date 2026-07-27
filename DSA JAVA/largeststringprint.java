import java.util.*;
public class largeststringprint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2 :");
        String str2 = sc.nextLine();
        System.out.print("Enter string3: ");
        String str3 = sc.nextLine();
        String largest = str1;
        if(str2.compareTo(largest)>0){
            largest = str2;

        }
        if(str3.compareTo(largest)>0){
            largest = str3;
        }
        System.out.println("largest string = " + largest);
        sc.close();
        
    }
    
}
