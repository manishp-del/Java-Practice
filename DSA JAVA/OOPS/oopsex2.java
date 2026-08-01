
import java.util.*;


public class oopsex2 {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Manishprasad";
        myAcc.setPassword("abcdefghi");

    }
    
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
