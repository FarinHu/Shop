import javax.swing.*;
import java.awt.*;
public class TheaShop extends mainpages{
    @Override
    protected JComponent buttons(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JButton additem = new JButton("Add Item");
        JButton logout = new JButton("Log Out");
        additem.setAlignmentX(Component.RIGHT_ALIGNMENT);
        logout.setAlignmentX(Component.RIGHT_ALIGNMENT);
        logout.addActionListener(e ->{
           TheaShop.this.dispose();
            login back = new login();
        back.setVisible(true);
    });
        additem.addActionListener(e -> {
            TheaShop.this.dispose();
            Adding add = new Adding();
            add.setVisible(true);
        });
        panel.add(additem);
        panel.add(logout);
        return panel;
    }
        }