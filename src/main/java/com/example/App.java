package com.example;

import com.example.Figures.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        // Circle circle = new Circle(21.2);
        // System.out.println(circle.area());
        
        // Create empty window
        JFrame frame = new JFrame("Hello, world!");

        frame.setSize(300, 200);
        
        // End process. If not used, the commandline will be closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Hola mundo", SwingConstants.CENTER);
        // label.setFont(new Font("Arial", Font.BOLD, 24));

        JPanel panel = new JPanel();
        panel.add(label);
        
        // JTextField num1Field = new JTextField(10);
        // panel.add(num1Field);

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);

    }
}
