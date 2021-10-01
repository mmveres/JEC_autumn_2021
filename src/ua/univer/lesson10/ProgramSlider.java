package ua.univer.lesson10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramSlider {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        JPanel panel = new JPanel();
        JButton button = new JButton("Start");
        JButton buttonLM = new JButton("-");
        JButton buttonLP = new JButton("+");
        JButton buttonRP = new JButton("+");
        JButton buttonRM = new JButton("-");
        JSlider slider = new JSlider();
        Thread thL= new Thread(
                () -> {
                    while (!Thread.interrupted())
                        synchronized (slider){
                    slider.setValue(slider.getValue()-1);
                    }
                }
        );
        Thread thR= new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while(!Thread.interrupted())
                           synchronized (slider){
                        slider.setValue(slider.getValue()+1);
                        }
                    }
                }
        );
        thL.setDaemon(true);
        thR.setDaemon(true);
        button.addActionListener(e -> {
            thL.start();
            thR.start();
        });
        buttonLM.addActionListener(e -> thL.setPriority(thL.getPriority()-1));
        buttonLP.addActionListener(e -> thL.setPriority(thL.getPriority()+1));
        buttonRP.addActionListener(e -> thR.setPriority(thR.getPriority()+1));
        buttonRM.addActionListener(e -> thR.setPriority(thR.getPriority()-1));


        panel.add(buttonLM);
        panel.add(buttonLP);
        panel.add(slider);
        panel.add(buttonRP);
        panel.add(buttonRM);
        panel.add(button);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
