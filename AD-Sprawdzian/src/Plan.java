import javax.swing.*;
import java.awt.*;

public class Plan {
    JFrame win ;
    private Plan(){
    TopPanel  topPanel = new TopPanel();
    JPanel pnlCenter = new JPanel(new BorderLayout());
    CenterPanel centerPanel = new CenterPanel();
    CenterPanel.add(centerPanel, BorderLayout.CENTER);
    BotPanel pnlBottom = new BotPanel();
         win = new JFrame("Harmonogram zajęć");
        win.add(topPanel , BorderLayout.PAGE_START);
        win.add(pnlCenter, BorderLayout.CENTER);
        win.add(pnlBottom, BorderLayout.PAGE_END);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.pack();
        win.setVisible(true);
    }
    public static void main(String[] args){
        new Plan();
    }
}
