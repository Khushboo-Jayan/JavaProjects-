package ie.tudublin;

// import java.lang.*;
// import java.util.*;

import javax.swing.JOptionPane;

public class MathManipulation {
    public static void main(String[] args){
        // float x = 3.14f;
        // float y = -10f;
        
        // float z = Math.max(x,y);

        // //find the hypotenuse of a right angeled triangle
        // float side1 = 0;
        // float side2 = 0;
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter Side 1 of right angeled triangle: ");
        // side1 = scanner.nextFloat();
        // System.out.print("Enter Side 2 of right angeled triangle: ");
        // side2 = scanner.nextFloat();

        // double hypo = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)); 
        // System.out.println("Hypotenuse of the triangle is: "+ hypo);
        // scanner.close();

        //find the hypotenuse of a right angeled triangle using GUI
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side1"));
        // JOptionPane.showMessageDialog(null, "Side1 is " + side1 + " cms.");

        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side2"));
        //JOption alwatys reads the value in as a string so we neeed to explicitly convert the value to a specific data type
        // JOptionPane.showMessageDialog(null, "Side 2 is " + side2 + " cms.");

        double hypo = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)); 
        // scanner.close();

        JOptionPane.showMessageDialog(null, "Hypotenuse is " + hypo + " cms.");

    }
}
