package Package1;

public class SamePackSubClass extends Class1 {
	public void read() {
		System.out.println("Reading sub class");
	}

	public static void main(String[] args) {
		SamePackSubClass c1 = new SamePackSubClass();
		c1.display1();
		c1.fetchsalary();
		c1.fetchemployeeID();
		c1.employeeDep();
		c1.read();
		// TODO Auto-generated method stub

	}

}
