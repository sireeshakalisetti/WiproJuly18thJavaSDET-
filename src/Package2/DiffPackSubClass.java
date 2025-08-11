package Package2;
import Package1.Class1;

public class DiffPackSubClass{
	public void print() {
		System.out.println("Printing the data");
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		DiffPackSubClass c2 = new DiffPackSubClass();
		c1.display1();
		c1.fetchsalary();
		c1.fetchemployeeID();
		c1.employeeDep();
		c2.print();// TODO Auto-generated method stub

	}

}
