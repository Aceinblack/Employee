
public class TestEmployee {

	public static void main(String[] args) {
		Manager employee1 = new Manager();
		Employee employee2;
		
		employee1.setFirstName("James");
		employee1.setLastName("Kluger");
		employee1.setEmployeeID(9999);
		employee1.setSalary(340000);
		employee1.setDepartment("Sales");
		
		employee2 = new Employee("Janet", "Joestar", 10034, 65000);
		
		
	}

}
