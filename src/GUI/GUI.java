package GUI;

import javax.swing.*;
import java.awt.*;

public class GUI{
    public static void Run(){
        
        final JFrame frame = new JFrame();
        final JLabel titleLabel = new JLabel();
        
        titleLabel.setBackground(new Color(75, 0, 130));
        titleLabel.setOpaque(true);
        titleLabel.setText("Project A");
        titleLabel.setForeground(Color.white);
        titleLabel.setVerticalAlignment(JLabel.TOP);
        titleLabel.setHorizontalAlignment(JLabel.LEFT);
        titleLabel.setBounds(0, 0, 1920, 30);
        
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1920, 1080);
//        frame.setLayout(null);
        frame.setTitle("Project A");
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(123, 104, 238));
        frame.add(titleLabel);
    }
}
