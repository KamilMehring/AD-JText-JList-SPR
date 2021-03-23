import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JList {
    public  ListModel data = new DefaultListModel();
    JTextArea txa;
    JScrollPane scp;
    CenterPanel(){
        this.txa=txa;
        scp = new JScrollPane(txa, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

    public static void add(CenterPanel centerPanel, String center) {
    }

    public  void append(String text) {
        txa.append(text);
    }
    public void overWrite(String text){
        txa.setText(text);
    }
    public Container get(){
        return scp;
    }

}


