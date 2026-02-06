import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame {
    public JTextField usernamesq;
    public JTextField passwordsq;

    public login(){
        setTitle("Login");
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(4,2,3,5));
        panel.add(new JLabel("Username :"));
        usernamesq = new JTextField();
        panel.add(usernamesq);
        panel.add(new JLabel("Password :"));
        passwordsq = new JTextField();
        panel.add(passwordsq);

        JButton loginb = new JButton("Login");
        JButton signb = new JButton("Sign In");
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(signb);
        panel.add(loginb);
        loginb.addActionListener(e -> loginmethod(e));
    //    signb.addActionListener(e -> {
        //    Signin signing = new Signin();
           // signing.setVisible(true);
         //       }
        add(panel);
    }

    
    private void loginmethod(ActionEvent e){
        String username = usernamesq.getText();
        String password = passwordsq.getText();
        //if ()
        //    else if ()
        //else{
          JOptionPane.showMessageDialog(this, "Login Failed .");
        }


    }