/**
 * Updated the comments. Standardized them
 * Inherits the employee class and adds
 * department information and displays it
 * @author Brinsly Yendeh
 * @version 1.1 09/05/2024
 */
public class Manager extends Employee{
	
	//department unique to manager type employees
	private String department = "";
	
	/**
	 * Set department
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * get department
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * override employeeSummary() of Employee class
	 * to add department information
	 */
	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + getDepartment());
	}
	
}
