package ATMPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class HomeScreen extends JFrame {
    private JTextField accountNumberField;
    private JPasswordField pinField;

    public HomeScreen() {
        setTitle("ATM Home Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel accountNumberLabel = new JLabel("Account Number:");
        accountNumberField = new JTextField();
        JLabel pinLabel = new JLabel("PIN:");
        pinField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountNumber = accountNumberField.getText();
                String pin = new String(pinField.getPassword());

                // Perform login validation here

                // Example validation
                if (accountNumber.equals("123456") && pin.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid account number or PIN!");
                }
            }
        });

        panel.add(accountNumberLabel);
        panel.add(accountNumberField);
        panel.add(pinLabel);
        panel.add(pinField);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }
}
