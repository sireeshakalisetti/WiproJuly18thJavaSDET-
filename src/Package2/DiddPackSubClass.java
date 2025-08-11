package Package2;
import Package1.Class1;
public class DiddPackSubClass extends Class1 {
	public void creat() {
		System.out.println("Creating in subclass");
	}

	public static void main(String[] args) {
		DiddPackSubClass c1 = new DiddPackSubClass();
		c1.creat();//own method
		c1.display1();//inherited
		c1.fetchsalary();
		c1.fetchemployeeID();
		c1.employeeDep();// TODO Auto-generated method stub

	}

}
