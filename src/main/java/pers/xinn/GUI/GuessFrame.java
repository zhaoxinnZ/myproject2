package main.java.pers.xinn.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {

    public GuessFrame(){
        super();
        setSize(600, 400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("ok");
        JLabel label = new JLabel("test");
        JTextField jTextField = new JTextField(10);

        setLayout(new FlowLayout());
        add(jTextField);
        add(label);
        add(button);
        setVisible(true);
        Random random = new Random();
        int secret = random.nextInt(10);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(jTextField.getText());
                System.out.println(num);

                if (num > secret){
                    label.setText("Smaller");
                }else if (num < secret){
                    label.setText("Bigger");
                }else {
                    label.setText("Bingo");
                }
            }
        });


    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
