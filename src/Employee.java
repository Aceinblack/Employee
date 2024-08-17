/**
 * 
 */

/**
 * 
 */
public class Employee {
	protected String firstName;
	protected String lastName;
	protected int employeeID;
	protected double salary;
	
	public Employee() {
		firstName = "";
		lastName = "";
		employeeID = 0;
		salary = 0.0;
	}
	
	public Employee(String firstName, String lastName, int employeeID, int salary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmployeeID(employeeID);
		this.salary = salary;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void employeeSummary() {
		System.out.println("Employee Name: " + getFirstName() + " " + getLastName());
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Salary: $" + getSalary());
	}
	
}
