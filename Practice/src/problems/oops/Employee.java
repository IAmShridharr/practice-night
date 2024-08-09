package problems.oops;

class HRManager extends Employee {

	public HRManager(double salary) {
		super(salary);
	}
	
	@Override
	public void work() {
		System.out.println("HR Manager kaam kar rha hai..!");
	}
	
}

public class Employee {
	private double salary;
	
	public Employee (double salary) {
		this.salary = salary;
	}
	
	public void work() {
		System.out.println("Employee kaam kar rha hai..!");
	}
	
	public double getSalary() {
		return salary;
	}
}
