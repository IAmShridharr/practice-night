package basics.two;

/*
 * Write a Java program to find the value of a specified expression.
 * a) 101 + 0) / 3
 * b) 3.0e-6 * 10000000.1
 * c) true && true
 * d) false && true
 * e) (false && false) || (true && true)
 * f) (false || false) && (true && true)
 * 
 * Expected Output :
 * (101 + 0) / 3)-> 33
 * (3.0e-6 * 10000000.1)-> 30.0000003
 * (true && true)-> true
 * (false && true)-> false
 * ((false && false) || (true && true))-> true
 * (false || false) && (true && true)-> false
 */

public class ComputeExpressions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(101 + 0) / 3)-> " + ((101 + 0) / 3));
		System.out.println("(3.0e-6 * 10000000.1)-> " + (3.0e-6 * 10000000.1));
		System.out.println("(true && true)-> " + (true && true));
		System.out.println("(false && true)-> " + (false && true));
		System.out.println("((false && false) || (true && true))-> " + ((false && false) || (true && true)));
		System.out.println("(false || false) && (true && true)-> " + ((false || false) && (true && true)));
	}

}
