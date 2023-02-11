package net.codejava;

// use scanner to take input
import java.util.Scanner;

/*
 * 02/02/2023
 * lab1.java
 * 
 * The point of this program is to take an input from the user, then based on the number inputed,
 * it should output 6 consecutive numbers and their fibonacci numbers. It will also show the amount of time
 * (in seconds) it takes for the program to get the fibonacci number. 
 */

public class lab1 {
    public static long fib(int n) {
    	// if 0 or 1, return n
        if (n <= 1) {
        	
            return n;
         } 
        // else commit to recursive fibonacci formula
        else {
            return fib(n - 1) + fib(n - 2);
        }
     }

public static void main(String[] args) {
    
	// object scanner
    Scanner input = new Scanner(System.in);
    
    // print message
    System.out.print("Enter a posotive integer: ");
    
    // reads the number entered
    int counter = input.nextInt();
    
    	// get time in milliseconds before loop starts
        long getBegin = System.currentTimeMillis();
        
        // for loop to get the 6 numbers after the number entered
        for (int i = counter; i < counter + 6; i++) {
        	
        	// the number stored in result var
            long result = fib(i);
            
            // get end time in milliseconds
            long getEnd = System.currentTimeMillis();
            
            // print the results
            System.out.println("The Fibonacci term at position " + i + " is " + result); 
            
            // divide time by 1000 to get seconds
            System.out.println("computed in " + ((getEnd - getBegin) / 1000) + " seconds.");
        }
    }
}
