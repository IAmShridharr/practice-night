package basics.one;

/*
 * Operator Precedence in Java:
 * Precedence	|	Operators					|	Associativity
 * 15			|	(), [], .					|	Left to Right
 * 14			|	++, --						|	Right to Left
 * 13			|	++, --, +, -, !, ~, (type)	|	Right to left
 * 12			|	*, /, %						|	Left to Right
 * 11			|	+, -						|	Left to Right
 * 10			|	<<, >>, >>>					|	Left to Right
 * 09			|	<, <=, >, >=, instanceOf	|	Left to Right
 * 08			|	==, !=						|	Left to Right
 * 07			|	&							|	Left to Right
 * 06			|	^							|	Left to Right
 * 05			|	|							|	Left to Right
 * 04			|	&&							|	Left to Right
 * 03			|	||							|	Left to Right
 * 02			|	?:							|	Right to left
 * 01			|	=, +=, -=, *=, /=, %=		|	Right to Left
 */

/*
 * Write a Java program to print the results of the following operations.
 * Test Data:
 * a. -5 + 8 * 6
 * b. (55+9) % 9
 * c. 20 + -3*5 / 8
 * d. 5 + 15 / 3 * 2 - 8 % 3
 * Expected Output:
 * 43
 * 1
 * 19
 * 13
 */

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-5 + 8 * 6);				// = -5 + 48 = 43
		System.out.println((55 + 9) % 9);			// = 64 % 9 = 1
		System.out.println(20 + -3 * 5 / 8);		// = 20 - 15 / 8 = 20 - 1 = 19
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);	// = 5 + 5 * 2 - 8 % 3 = 5 + 10 - 2 = 15 - 2 = 13
	}

}
