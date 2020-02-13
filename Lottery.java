//**************************************************************
// Lottery.java   Author: Luc Barenghien   Date: 11/5/2019 
// A lottery simulation program that compares user inputted
// values with computer generated ones and outputs outcome.
//**************************************************************

import java.lang.Math;
import java.util.Scanner;
//I had to import the math class and the scanner class because they are used in this program.
public class Lottery
{
  public static void main( String[] args )
  {
    int comp_num1 = (int) (Math.random()*54)+1;
    int comp_num2 = (int) (Math.random()*54)+1;
    int comp_num3 = (int) (Math.random()*54)+1;
    int comp_num4 = (int) (Math.random()*54)+1;
//The while loop below handles scenarios where there are duplicate balls.  The while loop will continue to find new numbers until it finds unique numbers.
    while (comp_num1 == comp_num2 || comp_num1 == comp_num3 || comp_num1 == comp_num4 || comp_num2 == comp_num1 || comp_num2==comp_num3 || comp_num2 == comp_num4 || comp_num3==comp_num1 || comp_num3==comp_num2 || comp_num3==comp_num4 || comp_num4==comp_num1 || comp_num4==comp_num2 || comp_num4==comp_num3)
    {
      comp_num1 = (int) (Math.random()*54)+1;
      comp_num2 = (int) (Math.random()*54)+1;
      comp_num3 = (int) (Math.random()*54)+1;
      comp_num4 = (int) (Math.random()*54)+1;
    }

      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter first guess number");
      int user_num1 = scan.nextInt();
      System.out.println("Please enter a unique second number");
      int user_num2 = scan.nextInt();
      System.out.println("Please enter a unique third number");
      int user_num3 = scan.nextInt();
      System.out.println("Please enter a unique fourth number");
      int user_num4 = scan.nextInt();

    
//The section directly below is the counter section.  In this section, I used many if statemejnts to compare the values of the user input and the computer generated values to determine how many matching numbers there are (if any).
    int counter = 0;
    if (user_num1 == comp_num1 || user_num1 == comp_num2 || user_num1 == comp_num3 || user_num1 == comp_num4)
    {
      counter++;
    }
    if (user_num2==comp_num1 || user_num2 == comp_num2 || user_num2==comp_num3 || user_num2==comp_num4)
    {
      counter++;
    }
    if (user_num3==comp_num1 || user_num3==comp_num2 || user_num3==comp_num3 || user_num3==comp_num4)
    {
      counter++;
    }
    if (user_num4==comp_num1 || user_num4==comp_num2 || user_num4==comp_num3 || user_num4==comp_num4)
    {
      counter++;
    }
    
// That concludes the counter section
//The section below is testing for the different results of the counter "i"
    if (counter == 0)
    {
      System.out.println("You lost");
    }
    else if (counter == 1)
    {
      System.out.println("Congratulations! You matched " +counter+ " number! You just won a free ticket");
    }
    else if (counter == 2)
    {
      System.out.println("Congratulations! You matched " +counter+ " numbers! You just won $25");
    }
    else if (counter == 3)
    {
      System.out.println("Congratulations! You matched " +counter+ " numbers! You just won $1000");
    }
    else
    {
      System.out.println("Congratulations! You matched " +counter+ " numbers! You just won $75,000");
    }
  }
}