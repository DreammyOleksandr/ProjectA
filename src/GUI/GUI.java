package GUI;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void Run(){
        
        final JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setTitle("Project A");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.darkGray);
    }
}
