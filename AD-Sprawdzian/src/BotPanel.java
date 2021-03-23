import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BotPanel extends JPanel {
    public BotPanel(){

        JButton btnSave = new JButton("Zapisz");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton btnExport = new JButton("Eskportuj");
        btnExport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(btnExport);
        this.add(btnSave);
    }

}
