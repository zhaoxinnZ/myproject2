package main.java.pers.xinn.GUI;

import javax.swing.*;
import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        JButton button = new JButton("OK");
        button.addActionListener(new MyActionListener());
        frame.setLayout(new FlowLayout());
        frame.add(button);
    }


}
