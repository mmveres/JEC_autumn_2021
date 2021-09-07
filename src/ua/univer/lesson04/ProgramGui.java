package ua.univer.lesson04;

import javax.swing.*;
import java.awt.event.*;


public class ProgramGui {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        JPanel panel = new JPanel();
        JTextField text = new JTextField("                ");
        JButton button = new JButton("ok");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("click");
            }
        });


        panel.add(text);
        panel.add(button);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
