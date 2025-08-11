package Package1;

public class Games extends Customer {
	String gname = "CandyCrush";
	String gid = "4754";
	String gtype = "crushing";
	void gam() {
		System.out.println(gname);
		System.out.println(gid);
		System.out.println(gtype);
	}
	

	public static void main(String[] args) {
		Customer cu = new Customer();
		Games g = new Games();
		g.gam();
		cu.cust();// TODO Auto-generated method stub

	}

}
