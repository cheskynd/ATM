package ATMPackage;
public class BankAccount {
    private double balance;
    private int pin;
    private String accountNumber;

    public BankAccount(String accountNumber,int pin, double balance ){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void withraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void changePin(int newPin){
        this.pin = newPin;
    }

    public int getPin() {
        return pin;
    }

}
