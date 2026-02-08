import javax.swing.*;
import java.awt.*;

public class mainpages extends JFrame{
    public mainpages(){
        setTitle("The Shopping Mall");
        setSize(1000,500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(header(),BorderLayout.NORTH);
        add(buttons(),BorderLayout.SOUTH);
    }
    public JPanel header(){
        JLabel label = new JLabel("Shopping Mall");
        label.setFont(new Font("Arial",Font.ITALIC,30));
        label.setForeground(Color.BLACK);

        JPanel titleplace = new JPanel();
        titleplace.setBackground(Color.CYAN);
        titleplace.setSize(new Dimension(1000,100));
                titleplace.add(label);
                return titleplace;
    }

    protected JComponent buttons(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        return panel;
    }

}
