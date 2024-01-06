//author:Sara Russert
//date:1/5/24
//file:ScannerInput.java

/*
   This program gets various data type input from user with Scanner
   object.
   It does not give correct output with string input.
   Your task is to find the bug.  
*/

import java.util.Scanner;

public class ScannerInput
{
   public static void main(String[] args)
   {
      //declare the various variables
      int intValue;
      double dblValue;
      String strValue;
      
      //create Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //collect integer input
      System.out.print("Enter an integer value:  ");
      intValue = keyboard.nextInt();
      
      //collect double input
      System.out.print("Enter a double value:  ");
      dblValue = keyboard.nextDouble();
      
      //consumes keyboard buffer value
      keyboard.nextLine();
          
      //collect string input
      System.out.print("Enter a string of characters:  ");
      strValue = keyboard.nextLine();
      
      //display all values to the user
      System.out.println("integer value entered: " + intValue);
      System.out.println("double value entered: " + dblValue);
      System.out.println("string of characters entered: " + strValue);
      
   }
}