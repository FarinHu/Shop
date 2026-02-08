import javax.swing.*;
import java.awt.*;
public class ThecShop extends mainpages{
    @Override
    protected JComponent buttons(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JButton addpro = new JButton("Cart");
        JButton logout = new JButton("Log Out");
        addpro.setAlignmentX(Component.RIGHT_ALIGNMENT);
        logout.setAlignmentX(Component.RIGHT_ALIGNMENT);
        logout.addActionListener(e ->{
            ThecShop.this.dispose();
            login back = new login();
            back.setVisible(true);
        });
        panel.add(addpro);
        panel.add(logout);
        return panel;
    }
}