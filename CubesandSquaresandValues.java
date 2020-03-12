/*
 * Launa Bucher-Austin
 * This program allows the user to square, cube, or add the power to any number of their choice.
 * March 12 2020
 */

package cubesandsquaresandvalues;

import java.util.Scanner;

/**
 *
 * @author labuc9806
 */
public class CubesandSquaresandValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in) ;
        
        int response = 0 ;
        int num;
        int num2;
        int num3;
        int answer;
        int power;
        
        while (response < 4)
        {
        System.out.println("Please choose an option : ");
        System.out.println("1. Find the value of a number squared");
        System.out.println("2. Find the value of a number cubed");
        System.out.println("3. Find the value of a number, to any power");
        System.out.println("4. Exit");
        response = keyedInput.nextInt();
        
        if (response == 1)
        {
            System.out.println("Please enter a number");
            num = keyedInput.nextInt();
            num = num*num;
            System.out.println("The answer is : "+ num +" ");
        }
        
        if (response ==2)
        { 
            System.out.println("Please enter a number :");
             num2 = keyedInput.nextInt();
             num2 = num2*num2*num2;
             System.out.println("The answer is : "+num2+" ");
        }
        
        if (response ==3)
        {
            System.out.println("Please enter a number : ");
            num3 = keyedInput.nextInt();
            System.out.println("Please enter the power : ");
            power = keyedInput.nextInt();
          
            System.out.println("The answer is :");
            System.out.println(Math.pow(num3, power));
        }
        
        if (response ==4)
        {
            System.out.println("Goodbye!");
        }
        
        }
        
        
       
        
    }
    
}
