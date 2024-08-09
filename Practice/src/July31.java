public class July31 {
	
	July31() {
		System.out.println("Kar sakta hu bhai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		July31 obj = new July31();
		
		int sum = obj.addTwoNumber(4, 5);
		int difference = obj.subtractTwoNumbers(8, 3);
		
		obj.kuchBhi();
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
	}
	
	int kuchBhi() {
		System.out.println("Ye kuch bhi method hai");
		return 0;
	}

	int addTwoNumber(int num1, int num2) {
		return num1 + num2;
	}
	
	int subtractTwoNumbers(int num1, int num2) {
		return num1 - num2;
	}

}
