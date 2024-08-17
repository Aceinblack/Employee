/**
 * Creates Employee and Manager objects
 * and displays them.
 * @author Brinsly Yendeh
 * @version 1.0 08/17/2024
 */
public class TestEmployee {

	public static void main(String[] args) {
		//Initialize both Employee objects
		Manager employee1 = new Manager();
		Employee employee2;
		
		employee1.setFirstName("James");
		employee1.setLastName("Kluger");
		employee1.setEmployeeID(9999);
		employee1.setSalary(340000);
		employee1.setDepartment("Sales");
		
		employee2 = new Employee("Janet", "Joestar", 10034, 65000);
		
		//displays both Employee object contents
		employee1.employeeSummary();
		employee2.employeeSummary();
	}

}
