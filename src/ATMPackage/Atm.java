package ATMPackage;
import java.util.Scanner;

public class Atm {
    private BankAccount bankAccount;
    Scanner acctInfo = new Scanner(System.in);
    private boolean isRunning = false;

    public Atm(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    public void Run(){
        boolean isAuthenticated = false;
        
        System.out.println("Welcome to Chesky ATM");

        while (!isAuthenticated){
            System.out.println("Enter your PIN");
            int enteredPin = acctInfo.nextInt();
            if (enteredPin == bankAccount.getPin()){
                isAuthenticated = true;
                System.out.println("Authentication Successful!");
                isRunning = true;
            }else{
                System.out.println("Inncorrect PIN. Please try again.");
            }
        }
        while(isRunning){
            displayMenu();
        }
    }

    public void checkBalance(){
        System.out.println("Your balance is: " + bankAccount.getBalance());
    }

    public void deposit(double depositAmount){
        bankAccount.deposit(depositAmount);
    }
    public void withdraw(double withdrawAmount){
        bankAccount.withraw(withdrawAmount);
    }
    public void changePin(int newPin){
        bankAccount.changePin(newPin);
    }

    public void logout(){
        System.out.println("Logging out...");
        isRunning = false;
    }

    public void displayMenu(){

        System.out.println("------- Menu -------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Change PIN");
        System.out.println("5. Logout");
    
        System.out.println("Enter Your Choice: ");
        int choice = acctInfo.nextInt();

        switch (choice){
            case 1:
                checkBalance();
                break;
            case 2:
                System.out.println("Enter The amount to deposit: ");
                double depositAmount = acctInfo.nextDouble();
                deposit(depositAmount);
                break;
            case 3:
                System.out.println("Enter The amount to withdraw: ");
                double withdrawAmount = acctInfo.nextDouble();
                withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Enter your New PIN: ");
                int newPin = acctInfo.nextInt();
                changePin(newPin);
                break;
            case 5:
                logout();
                isRunning = false;
                break;

        }
    }
}
