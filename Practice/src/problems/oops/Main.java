package problems.oops;

public class Main {
	
	public int add (int a, int b) {
		System.out.println("int a aur int b");
		return a + b;
	}
	
	public double add (double a, double b) {
		System.out.println("double a aur double b");
		return a + b;
	}
	
	public double add (int a, double b) {
		System.out.println("int a aur double b");
		return a + b;
	}
	
	public double add (double a, int b) {
		System.out.println("double a aur int b");
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		System.out.println(main.add(6, 7.0));
	}

}
