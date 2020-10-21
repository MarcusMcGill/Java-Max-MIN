//Damarcus McGill
//MSC 501 x70
//Week 1 Assignment: Question 3 (Program 2)
//10/20/20

import java.util.Scanner; //Scanner statement for input
import java.lang.Math; // Math statement for smallest and largest values

public class Program2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //input statement

        System.out.print("Enter first integer: "); //1st prompt for user
        int number1 = input.nextInt(); //first integer

        System.out.print("Enter second integer: "); //2nd prompt for user
        int number2 = input.nextInt(); //second integer

        System.out.print("Enter third integer: "); //3rd prompt for user
        int number3 = input.nextInt(); //third integer

        int sum = number1 + number2 + number3;  //sum of three values
        int product = number1 * number2 * number3; //product of three values
        int average = (number1 + number2 + number3)/3; //average of three values
        int largest = Math.max(Math.max(number1,number2),number3); // largest of three values using .max comparison
        int smallest = Math.min(Math.min(number1,number2),number3); // smallest of three values using .min comparison

        //integers to strings for conversion print statements
        String num1 = Integer.toString(number1);
        String num2 = Integer.toString(number2);
        String num3 = Integer.toString(number3);

        //set up of each print statement for sum, product, and average
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + product);
        System.out.println(num1 + " + " + num2 + " + " + num3 + " /3 " + " = " + average);

        //print statements for smallest and largest integers
        System.out.println( "Of " + num1 + " , " + num2 + " , " + num3 + ", " + largest + " is the largest.");
        System.out.println( "Of " + num1 + " , " + num2 + " , " + num3 + ", " + smallest + " is the smallest.");


    }
}