package ie.tudublin;

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //JOption alwatys reads the value in as a string so we neeed to explicitly convert the value to a specific data type
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cms tall.");


    }
}
