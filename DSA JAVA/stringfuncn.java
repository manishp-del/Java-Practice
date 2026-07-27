import java.util.*;
public class stringfuncn {
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);

        }
        return substr;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string :");
        String str = sc.nextLine();
        System.out.print("enter starting index : ");
        int si =  sc.nextInt();
        System.out.print("enter ending index : ");
        int ei = sc.nextInt();
        System.out.println("substring = " + substring(str, si, ei));
        sc.close();
    }
    
}
