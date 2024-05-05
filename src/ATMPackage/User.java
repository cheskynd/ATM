package ATMPackage;
public class User {
    public String name;
    private BankAccount bankAccount;
    
    public User(String name, BankAccount bankAccount){
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public BankAccount geBankAccount() {
        return bankAccount;
    }
}
