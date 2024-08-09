import java.util.Scanner;

public class July30 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (isEven(num)) {
			System.out.println("Even number hai");
		} else {
			System.out.println("Odd number hai");
		}
		
		sc.close();
	}

	
	static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
