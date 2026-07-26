import java.util.*;        
public class concatanationfunction {
    public static void printletters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstname = "manish";
        String lastname = "Prasad";
        String fullname = firstname + " " + lastname;
        printletters(fullname);

    }
    
}
