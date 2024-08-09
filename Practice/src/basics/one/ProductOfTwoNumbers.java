package basics.one;

import java.util.Scanner;

/*
 * Write a Java program that takes two numbers as input and displays the product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output :
 * 25 x 5 = 125
 */

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
	}

}
