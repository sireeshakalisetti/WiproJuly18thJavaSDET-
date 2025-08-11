package corejava;

public class extFinal extend FinalKyw{
	void meth() {
		a = 240;
		System.out.println(a);
		System.out.println("This is inherited final method");
	}

	public static void main(String[] args) {
		extFinal ef = new extFinal();
		ef.meth();
		// TODO Auto-generated method stub

	}

}
