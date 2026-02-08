import javax.swing.*;
import java.awt.*;

public class Adding extends JFrame{
    public JTextField name;
    public JTextField price;
    public JTextField stock;

    public Adding(){
        setTitle("Add Page");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(4 , 3 , 4 , 3));
        panel.add(new JLabel("Products Name :"));
        name = new JTextField();
        panel.add(name);
        panel.add(new JLabel("Products Price :"));
        price = new JTextField();
        panel.add(price);
        panel.add(new JLabel("In Stock :"));
        stock = new JTextField();
        panel.add(stock);
        JButton ok = new JButton("Save");
        panel.add(ok);
        ok.addActionListener(e -> {
            String itemn = name.getText();
            double prices = Double.parseDouble(price.getText());
            int instock = Integer.parseInt(stock.getText());
            items nitem = new items(itemn,prices,instock);
        });
        JButton cancel = new JButton("Cancel");
        panel.add(cancel);
        cancel.addActionListener(e -> {
            this.dispose();
            TheaShop shop = new TheaShop();
            shop.setVisible(true);
        });
        panel.setVisible(true);
        this.add(panel);
    }


}
