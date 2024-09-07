package com.example.Figures;

import java.lang.reflect.Field;
import java.util.Random;
import javax.swing.*;
import java.awt.*;;

public abstract class BaseFigure {
    public abstract double area();
    public abstract double perimetro();
    public abstract Field[] getFields();
    
    public void test(JPanel mainPanel){
        Field[] fields = getFields();
        System.out.println(fields);

        JPanel subPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        JLabel columnLabel = new JLabel(this.getClass().getSimpleName());
        JLabel emptyLabel = new JLabel("");
        subPanel.add(columnLabel);
        subPanel.add(emptyLabel);

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
            
            inputField.setPreferredSize(new Dimension(100, 25));  // Fixed width and height

            // Add the label and input to the panel
            subPanel.add(fieldLabel);
            subPanel.add(inputField);
            subPanel.setBackground(getRandomColor());
            
            mainPanel.add(subPanel);
            
        }
    }
    
        // Function to generate a random color
        public Color getRandomColor() {
            Random random = new Random();
            // Generate random values for R, G, and B (0-255)
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            // Return a new color with the generated RGB values
            return new Color(red, green, blue);
        }
}