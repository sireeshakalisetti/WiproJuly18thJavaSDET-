package Labsession31;

public class Employee {
	String name;
	double sal;
	
	Employee(String name,double sal ) {
		this.name=name;
		this.sal = sal;
	
	}
	public String toString() {
		return name+ " "+sal;
	}

}
