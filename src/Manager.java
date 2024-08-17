/**
 * Inherits the employee class and adds
 * department information and displays it
 * @author Brinsly Yendeh
 * @version 1.0 08/17/2024
 */
public class Manager extends Employee{
	
	private String department = "";
	
	//Set department
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//get department
	public String getDepartment() {
		return department;
	}
	
	//override employeeSummary() of Employee class
	//to add department information
	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + getDepartment());
	}
	
}
