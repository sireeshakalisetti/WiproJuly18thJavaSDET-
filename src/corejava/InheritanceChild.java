package corejava;

public class InheritanceChild extends InheritanceParent {
	String model = "Tata mini";
	public void display2(){
		System.out.println("Brand name is " + brand);
		System.out.println("Model name is " + model);
	}


	public static void main(String[] args) {
		InheritanceChild c1 = new InheritanceChild();
		c1.display1();
		c1.display2();
		// TODO Auto-generated method stub

	}

}
