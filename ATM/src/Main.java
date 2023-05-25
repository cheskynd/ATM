public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount("123456789", 1000, 1234);

        // Create a User object
        User user = new User("John Doe", bankAccount);

        // Create an ATM object with the User's BankAccount
        Atm atm = new Atm(user.geBankAccount());

        // Run the ATM program
        atm.Run();
    }
}
