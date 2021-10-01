package ua.univer.lesson10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {
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
                new Thread(
                        () ->
                        {
                            for (int i = 0; i < 100; i++) {
                                text.setText("click" + i);
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException interruptedException) {
                                    interruptedException.printStackTrace();
                                }
                            }
                        }
                ).start();
            }
        });


        panel.add(text);
        panel.add(button);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
