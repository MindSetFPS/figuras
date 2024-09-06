package com.example;

import com.example.Figures.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class App 
{
    public static void main( String[] args )
    {
        // Create empty window
        JFrame frame = new JFrame("Hello, world!");

        // Give window a size
        frame.setSize(300, 200);
        
        // End process. If not used, the commandline will be closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Field[] fields = Circle.class.getFields();
        
        // JLabel label = new JLabel("Hola mundo", SwingConstants.CENTER);
        // label.setFont(new Font("Arial", Font.BOLD, 24));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(fields.length, 2));
        // panel.add(label);
        
        for (Field field : fields) {
            // Create a label for the field
            JLabel fieldLabel = new JLabel(field.getName());

            // Determine the type of the field and create appropriate input
            JComponent inputField;
            if (field.getType() == String.class) {
                inputField = new JTextField(20);  // Text input for String
            } else if (field.getType() == int.class) {
                inputField = new JTextField(20);  // Text input for integers
            } else if (field.getType() == boolean.class) {
                inputField = new JCheckBox();  // Checkbox for boolean
            } else {
                inputField = new JTextField(20);  // Fallback to text input for other types
            }

            // Add the label and input to the panel
            panel.add(fieldLabel);
            panel.add(inputField);
        }
        
        // JTextField num1Field = new JTextField(10);
        // panel.add(num1Field);

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);

    }
}