package com.example.Figures;

import java.lang.reflect.Field;

import javax.swing.*;
import java.awt.*;;

public abstract class BaseFigure {
    public abstract double area();
    public abstract double perimetro();
    public abstract Field[] getFields();
    
    public void test(JPanel panel){
        Field[] fields = getFields();
        System.out.println(fields);

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
            panel.add(fieldLabel);
            panel.add(inputField);
            
        }
    }
}