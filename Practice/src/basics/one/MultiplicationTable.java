package basics.one;

import java.util.Scanner;

/*
 * Write a Java program that takes a number as input and prints its multiplication table up to 10.
 * Test Data:
 * Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a nuumber: ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

}
