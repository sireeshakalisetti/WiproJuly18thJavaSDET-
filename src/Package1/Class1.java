package Package1;

public class Class1 extends Student{
	private static String empsal = "2484214";
	private void fetchsalary() {
		System.out.println("The employee salary is" + empsal);
	}
	public void display1() {
		System.out.println("Display class1");
	}
	int employeeId = 76785;
	void fetchemployeeID() {
		System.out.println("The employee Salary is " + employeeId);
	}
	String empDep = "It";
	protected void employeeDep() {
		System.out.println("The employee department is " + empDep);
	}
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Student s = new Student();
		c1.display1();
		c1.fetchsalary();
		c1.fetchemployeeID();
		c1.employeeDep();
		s.stu();// TODO Auto-generated method stub

	}

}
