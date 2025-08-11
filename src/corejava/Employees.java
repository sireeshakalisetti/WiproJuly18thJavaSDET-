package corejava;
/*Employee Salary Validation
Create a Employee class with private fields: name, id, salary
Salary must be positive — implement validation inside the setter
Add a method to displayDetails() showing all info
Create multiple employee objects and test with different salary values.*/

public class Employees {
	private String name;
	private int id;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Salary was invalid");
		}
	}

	public static void main(String[] args) {
		Employees e = new Employees();
		e.setName("Siri");
		e.setID(471);
		e.setSalary(425365);
		System.out.println("Name: " + e.getName());
		System.out.println("ID: " + e.getID());
		System.out.println("Salary: " + e.getSalary());
		Employees e1 = new Employees();
		e1.setName("Shiva");
		e1.setID(481);
		e1.setSalary(0);
		System.out.println("Name: " + e1.getName());
		System.out.println("ID: " + e1.getID());
		System.out.println("Salary: " + e1.getSalary());
		Employees e2 = new Employees();
		e2.setName("Sai");
		e2.setID(47221);
		e2.setSalary(-556654);
		System.out.println("Name: " + e2.getName());
		System.out.println("ID: " + e2.getID());
		System.out.println("Salary: " + e2.getSalary());// TODO Auto-generated method stub

	}

}
