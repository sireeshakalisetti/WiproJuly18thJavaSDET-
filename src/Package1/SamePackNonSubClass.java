package Package1;

public class SamePackNonSubClass {
	public void write() {
		System.out.println("Writing in sub class");
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		SamePackNonSubClass obj = new SamePackNonSubClass();
		c1.display1();
		c1.fetchsalary();
		c1.fetchemployeeID();
		c1.employeeDep();
		obj.write();
		// TODO Auto-generated method stub

	}

}
