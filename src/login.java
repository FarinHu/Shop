import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class login extends JFrame {
    public JTextField usernamesq;
    public JTextField passwordsq;

    public login() {
        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(4, 2, 3, 5));
        panel.add(new JLabel("Username :"));
        usernamesq = new JTextField();
        panel.add(usernamesq);
        panel.add(new JLabel("Password :"));
        passwordsq = new JTextField();
        panel.add(passwordsq);

        JButton loginb = new JButton("Login");
        loginb.setFocusable(false);
        JButton signb = new JButton("New User?");
        signb.setFocusable(false);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(signb);
        panel.add(loginb);
        loginb.addActionListener(e -> loginmethod(e));
        signb.addActionListener(e -> {
            Signin signing = new Signin();
            signing.setVisible(true);
        });
        add(panel);
    }


    private void loginmethod(ActionEvent e) {
        String username = usernamesq.getText();
        String password = passwordsq.getText();
        if (people.People.containsKey(username)) {
            if (username.equals("Admin")) {
                if ((people.People.get(username)).equals(password)) {
                    TheaShop shopa = new TheaShop();
                    this.dispose();
                    shopa.setVisible(true);
                }
            } else {
                if ((people.People.get(username)).equals(password)) {
                    ThecShop shopc = new ThecShop();
                    this.dispose();
                    shopc.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Please Enter The Password Correctly");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "This Username Does Not Exist");
        }
    }
}