package basics.two;

import java.util.Scanner;

/*
 * Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
 * 
 * Sample Output:
 * Input first number: 25
 * Input second number: 37
 * Input third number: 45
 * Input fourth number: 23
 * Numbers are not equal!
 */

public class EqualityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input first number: ");
		int num2 = sc.nextInt();
		System.out.print("Input first number: ");
		int num3 = sc.nextInt();
		System.out.print("Input first number: ");
		int num4 = sc.nextInt();
		sc.close();
		
		if((num1 == num2) && (num1 == num3) && (num1 == num4)) {
			System.out.println("Numbers are equal!");
		} else {
			System.out.println("Numbers are not equal!");
		}
	}

}
