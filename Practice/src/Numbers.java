public class Numbers {
	int n1, n2;
	
	Numbers(int num1, int num2) {
		System.out.println("Kuch to print karo");
		n1 = num1;
		n2 = num2;
	}
	
	Numbers() {
		System.out.println("Ye wala karray");
	}
	
	
	int kuchBhi() {
		System.out.println("Ye kuch bhi method hai");
		return 0;
	}

	int addTwoNumber() {
		return n1 + n2;
	}
	
	int subtractTwoNumbers() {
		return n1 - n2;
	}
}