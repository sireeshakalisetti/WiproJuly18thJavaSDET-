package corejava;

public class InterfaceChild implements Interface1 {
	public void display() {
		System.out.println("Displaying in chaild class");
	}
	public void read() {
		System.out.println("Reading in child class");
	}

	public static void main(String[] args) {
		InterfaceChild ic = new InterfaceChild();
		ic.display();
		ic.read();
		ic.show();
		Interface1.write();
		System.out.println(empName);
		System.out.println(empId);
		// TODO Auto-generated method stub

	}

}
