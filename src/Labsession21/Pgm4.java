package Labsession21;

import java.util.*;


public class Pgm4 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        
        int temp = a;
        a = b;
        b = temp;

     
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
	//sc.close();

}
