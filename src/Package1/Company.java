package Package1;

public class Company {
	protected String empName = "Hema";
	protected String empid = "456";
	protected String empdep = "nonit";
	protected void cmp() {
		System.out.println(empName);
		System.out.println(empid);
		System.out.println(empdep);
	}

	public static void main(String[] args) {
		Company c = new Company();
		c.cmp();// TODO Auto-generated method stub

	}

}
