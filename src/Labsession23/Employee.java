package Labsession23;
class Employee {
	public void work() {
		System.out.println("Employee work");
	}
	public void getSalary() {
		System.out.println("Employee sal");
	}
}

class HRManager extends Employee {
	public void work() {
		System.out.println("emp work");
	}
	public void addEmployee() {
		System.out.println("emp work one");
	}
}