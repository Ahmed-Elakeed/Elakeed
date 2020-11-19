package presentation;

import javax.swing.*;
import java.awt.*;

public class OwnerForm extends JFrame {
    private JPanel mainPanel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public OwnerForm(){
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width,screen.height);
        setTitle("Owner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(mainPanel);
    }
}
