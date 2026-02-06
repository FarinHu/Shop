import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class Signin extends JFrame{
    private JTextField usernamesq;
    private JTextField passwordsq;
    public Signin(){
        setTitle("Sign in");
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(4, 2,3, 5));
        panel.add(new JLabel("New Username :"));
        usernamesq = new JTextField();
        panel.add(usernamesq);
        panel.add(new JLabel("New Password"));
        passwordsq = new JTextField();
        panel.add(passwordsq);
        JButton Registerb = new JButton("Register");
        panel.add(new JLabel());
        panel.add(Registerb);
        Registerb.addActionListener((ActionEvent e) -> {
           String newUser = usernamesq.getText();
           String newPass = passwordsq.getText();
           if(newPass.isEmpty()){
               JOptionPane.showMessageDialog(this ,"Please Enter Your Password");
           return;
           }
           if(people.People.containsKey(newUser)){
               JOptionPane.showMessageDialog(this,"This Username Is Taken");
               return;
           }
           else{
               people.People.put(newUser , newPass);
               JOptionPane.showMessageDialog(this,"You Have Been Registered Successfully");
               this.dispose();
           }

        });
        add(panel);
    }

}