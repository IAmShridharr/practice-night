package basics.two;

import java.util.Scanner;

/*
 * Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
 * 
 * Sample Output:
 * Input first number: 5
 * Input second number: 1
 * false
 */

public class RangeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Input second number: ");
		double num2 = sc.nextDouble();
		sc.close();
		
		if (((num1 >= 0) && (num1 <= 1)) && ((num2 >= 0) && (num2 <= 1))) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
