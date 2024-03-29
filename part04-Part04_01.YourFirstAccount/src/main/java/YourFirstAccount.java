
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        Account elenasAccount = new Account("Elena's account", 100.0);

        elenasAccount.deposit(20.0);

        System.out.println(elenasAccount.toString());
    }
}
