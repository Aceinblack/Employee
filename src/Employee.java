/**
 * Updated the comments. Standardized them
 * Class holding employee data, ways to set, get
 * and display said data
 * @author Brinsly Yendeh
 * @version 1.1 09/05/2024
 */
public class Employee {
	
	//Employee Details
	protected String firstName;
	protected String lastName;
	protected int employeeID;
	protected double salary;
	
	/**
	 * default constructor
	 */
	public Employee() {
		firstName = "";
		lastName = "";
		employeeID = 0;
		salary = 0.0;
	}
	
	//Parameterized constructor
	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeID
	 * @param salary
	 */
	public Employee(String firstName, String lastName, int employeeID, int salary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmployeeID(employeeID);
		this.salary = salary;
	}
	
	/**
	 * setter methods
	 */
	
	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @param employeeID
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	/**
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * getter methods
	 */
	
	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @return employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}
	
	/**
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Displays employee data
	 */
	public void employeeSummary() {
		System.out.println("Employee Name: " + getFirstName() + " " + getLastName());
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Salary: $" + getSalary());
	}
	
}
