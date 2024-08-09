package problems.oops.aug09;

class Person {
	private String firstName;
	protected String lastName;
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		System.out.println("First Name: " + firstName);
		return firstName;
	}
	
    public String getLastName(){
    	System.out.println("Last Name: " + lastName);
		return lastName;
    }
}

class Employee extends Person{
	
	private int employeeID;
	private String jobTitle;
	
	Employee(int employeeID, String jobTitle, String firstName, String lastName) {
		super(firstName, lastName);
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;
	}
	
	public int getEmployeeID() {
		System.out.println("Employee ID: " + employeeID);
		return employeeID;
	}
	
	@Override
	public String getLastName(){
		System.out.println("Employee Job Title: " + jobTitle);
		System.out.println("Last Name: " + lastName);
		return lastName;
    }
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1, "Software Engineer", "Jaggu", "Daada");
		employee.getLastName();
		employee.getEmployeeID();
	}

}
