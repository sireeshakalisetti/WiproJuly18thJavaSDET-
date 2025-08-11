package corejava;

public class MethodOverloading {
	public int add(int a) {
		return a;
	}
	public long add(long a, long b) {
		long c = a + b;
		return c;
	}
	public double add(double a, double b, double c) {
		double d = a + b + c;
		return d;
	}
	

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.add(10));
		System.out.println(mo.add(200000,300000));
		System.out.println(mo.add(40.9874,50.63567,60.6456727));// TODO Auto-generated method stub

	}

}
