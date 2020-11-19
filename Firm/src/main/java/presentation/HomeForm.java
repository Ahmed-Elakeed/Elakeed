package presentation;

import dataAccess.dataBase.ConnectionDB;
import domain.*;
import service.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeForm extends JFrame {

    private JPanel mainPanel;
    private JButton empButt;
    private JButton ownerButt;
    private JButton propertyButt;
    private JButton salesOfficeButt;
    private JButton percentOwnedButt;
    private JLabel lable1;



    public HomeForm() {
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width,screen.height);
        setTitle("Home");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(mainPanel);
        ownerButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new OwnerForm().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        PercentOwnedService percentOwnedService=new PercentOwnedService();
        for(PercentOwned percentOwned:percentOwnedService.findAllPercentOwned()){
            percentOwned.print();
        }
    }
}
