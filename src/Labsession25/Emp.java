package Labsession25;

class Emp {
	private String name;
	private int id;
	private double salary;
	
	Emp(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void setSal(double salary) {
		
		if (salary > 0) {
			System.out.println("Salary must be posistive");
		} 
		else {
			System.out.println("sal not a negative");
		}
	}
	
	void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
 
    }
	
}
