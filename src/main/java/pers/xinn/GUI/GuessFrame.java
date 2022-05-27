package main.java.pers.xinn.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    public GuessFrame(){
        super();
        setSize(600, 400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        JButton button = new JButton("hi");
        JLabel label = new JLabel("test");

        setLayout(new FlowLayout());
        add(label);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("hello!");
                label.setText("hello");
            }
        });


    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
