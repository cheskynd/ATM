package ATMPackage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ATMPackage.BankAccount;
import ATMPackage.User;
import ATMPackage.Atm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout; // Add this import statementackage name before the class name

/// Source for the GUI class: https://www.youtube.com/watch?v=5o3fMLPY7qY

public class GUI implements ActionListener{

    int count = 0;
    JLabel label;
    JFrame frame;
    JButton button; 
    JButton withdrawBTN;
    JButton depositBTN;
    JButton changePinBTN;
    JButton balanceBTN;
    JButton logoutBTN;


    public GUI(){
        frame = new JFrame();
        button = new JButton("Click me");
        button.addActionListener(this); 
        withdrawBTN = new JButton("Withdraw");
        depositBTN = new JButton("Deposit");
        changePinBTN = new JButton("Change Pin");
        balanceBTN = new JButton("Check Balance");
        logoutBTN = new JButton("Logout");

        label = new JLabel("NUMBER OF CLICKS: 0 ");

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(withdrawBTN);
        panel.add(depositBTN);
        panel.add(changePinBTN);
        panel.add(balanceBTN);
        panel.add(logoutBTN);
        panel.add(label);

        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ATM");
        frame.pack();
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("NUMBER OF CLICKS: " + count);
        
        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}


