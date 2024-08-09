package basics.two;

/*
 * Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.
 * 
 * Sample array:
 * array = {{true, false, true},
 * {false, true, false}};
 * Expected Output :
 * t f t
 * f t f
 */

public class BooleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] arr = {{true, false, true}, {false, true, false}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == true) {
					System.out.print("t ");
				} else {
					System.out.print("f ");
				}
			}
			System.out.println();
		}
	}

}
