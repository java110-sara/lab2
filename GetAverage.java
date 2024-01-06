//author:Sara Russert
//date:1/5/24
//file:GetAverage.java

/*
   Lab 2 Part 1
   Problem to solve:
   Calculate the average of two double data type numbers
   Use both Scanner object and JOptionPane to collect user input
   Demonstrate the need to use parentheses to override 
   operator precedence
*/

//import statements for Scanner and JOptionPane
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GetAverage
{
   public static void main(String[] args)
   {
      //declare three double variables to store the 
      //two numbers and their average
      double num1, num2, aveValue;
      
      //declare String variable for use with input dialog
      String inputString;
      
      //create Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //get user input for the two nums with the Scanner object
      System.out.println("Use Scanner object to collect user input:");
      
      //prompt user to enter the first number
      System.out.print("Enter the first number:  ");    
      //use the nextDouble( ) method to get a double value
      num1 = keyboard.nextDouble();
      
      //prompt user to enter the second number
      System.out.print("Enter the second number:  ");
      //use the nextDouble( ) method to get a double value
      num2 = keyboard.nextDouble();
      
      //calculate the average
      //note that the parentheses are required for correct output
      aveValue = (num1 + num2) / 2;
      
      //display the result to the user:
      System.out.print("The average of " + num1 + " and " + num2 + " is: ");
      System.out.println(aveValue);
      
      //get user input with JOptionPane input dialog
      System.out.println("Use JOptionPane input dialog to collect user input:");
      
      //use JOptionPane to get user input for first number:
      inputString = JOptionPane.showInputDialog("Enter the first number:  ");
      
      //convert the string to a double and assign to num1
      num1 = Double.parseDouble(inputString);
      
      //get user input for second number:
      inputString = JOptionPane.showInputDialog("Enter the second number:  ");
      //convert the string to a double and assign to num1
      num2 = Double.parseDouble(inputString);
      
      //calculate the average of the two numbers
      aveValue = (num1 + num2) / 2;
      
      //display the result to the user:
      System.out.print("The average of " + num1 + " and " + num2 + " is: ");
      System.out.println(aveValue); 
      
      System.exit(0);    
   }
}

