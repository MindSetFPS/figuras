package com.example;

import com.example.Figures.*;
import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(13.9);
        double[] sides = { 1.5, 2.3, 3.5 };
        Triangle triangle = new Triangle(sides);
        Square square = new Square(12);
        com.example.Figures.Rectangle rectangle = new com.example.Figures.Rectangle(23, 12);

        // Create empty window
        JFrame frame = new JFrame("Hello, world!");

        // Give window a size
        frame.setSize(600, 400);

        // End process. If not used, the commandline will be closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel label = new JLabel("Hola mundo", SwingConstants.CENTER);
        // label.setFont(new Font("Arial", Font.BOLD, 24));

        // Create a JPanel with GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE; // Prevent stretching

        gbc.insets = new Insets(5, 5, 5, 5); // Add padding between components

        circle.test(mainPanel);
        rectangle.test(mainPanel);
        triangle.test(mainPanel);
        square.test(mainPanel);

        mainPanel.revalidate();
        mainPanel.repaint();

        frame.getContentPane().add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}