import java.util.ArrayList;
import java.util.List;

public class MainBank {
    public static void main(String[] args) {
        Account<Character> myAccount=new Account<Character>("Ali",700,'$');
        myAccount.showBalance();

        Account<String> otherAccount=new Account<String>("Ahmed",400,"DOLLAR");
        otherAccount.showBalance();

        Bank myBank = new Bank("AliBank");

        myBank.transfer(otherAccount, myAccount ,100.00);

        myAccount.showBalance();
        otherAccount.showBalance();




    }
}
