//author: Sara Russert
//date: 1/5/24
//file: CircleArea.java
//code for students; needs modification
/*
   Lab2 Part 2:
   Calculate the area of a circle
   Collect user input with Scanner object
   and also with JOptionPane input dialog
   Perform the area calculation twice,
   since user input is collected two ways
*/

//import statements for Scanner and JOptionPane
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CircleArea
{
   public static void main(String[] args)
   {
      //declare double variables for radius and area
      double radius, area;
      
      //declare String variable for use with input dialog
      String inputString;
      
      //create Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //get user input for the radius with the Scanner object
      System.out.println("Use Scanner object to collect user input for radius:");
      System.out.print("Enter the radius:  ");
      radius = keyboard.nextDouble();
      
      //calculate the area using Math library for the value of PI 
      //use Math.pow to square the radius value
      area = Math.PI * (Math.pow(radius, 2));
      
      //display the result to the user
      System.out.println("The area of a circle with the radius " + radius + " is " + area);
      
      //get user input with JOptionPane input dialog
      System.out.println("Use JOptionPane input dialog to collect user input for the radius:");
      //get user input for radius:
      inputString = JOptionPane.showInputDialog("Enter the radius:  ");
      //convert the string to a double and assign to radius
      radius = Double.parseDouble(inputString);

      //calculate the area using Math library for the value of PI    
      //use Math.pow to square the radius value
      area = Math.PI * (Math.pow(radius, 2));
      
      //display the result to the user
      System.out.println("The area of a circle with radius " + radius + " is " + area);
      
      System.exit(0);
   }
}

