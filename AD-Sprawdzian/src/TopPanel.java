import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel  {
    private JTextField txtLekcja, txtGodziny, txtTematy ;
    private JButton btnADD;
    public TopPanel(){
        JLabel Lekcja = new JLabel("Lekcja:");
        JLabel Godziny = new JLabel("Liczba Godziny:");
        txtGodziny = new JTextField("");
        JLabel Tematy = new JLabel("Temat");
        txtLekcja = new JTextField("");
        txtTematy = new JTextField(3);
        btnADD = new JButton("+");
        JPanel TopPnl = new JPanel();
        TopPnl.add(txtLekcja);
        TopPnl.add(Lekcja);
        TopPnl.add(txtGodziny);
        TopPnl.add(Godziny);
        TopPnl.add(txtTematy);
        TopPnl.add(Tematy);
        TopPnl.add(btnADD);
        this.add(TopPnl, BorderLayout.PAGE_START);
        this.setLayout(new BorderLayout());
        
    }


}
