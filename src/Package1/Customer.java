package Package1;

public class Customer extends Company {
	public String cusName = "Sai";
	public String cusid = "496";
	public String cusdep = "sales";
	public void cust() {
		System.out.println(cusName);
		System.out.println(cusid);
		System.out.println(cusdep);
	}
	

	public static void main(String[] args) {
		Customer cu = new Customer();
		Company c = new Company();
		c.cmp();
		cu.cust();
		// TODO Auto-generated method stub

	}

}
