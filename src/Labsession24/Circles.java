package Labsession24;

public class Circles implements Shapes {
	float pi = 3.1415f;
	int r = 5;
	double d = pi*r*r;
	public void getArea() {
		d = pi*r*r;
		System.out.println("Citcles area is " + d);
	}
	public static void main(String [] args) {
		Circles c = new Circles();
		c.getArea();
	}

}
