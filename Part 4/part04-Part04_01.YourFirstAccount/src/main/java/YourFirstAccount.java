
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account sithuAcc = new Account("Khant Sithu", 100.0);
        sithuAcc.deposit(20.0);
        System.out.println(sithuAcc.toString());
        
    }
}
