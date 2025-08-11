package Labsession24;

public class Triangles implements Shapes{

	public void getArea() {
		int b = 20;
		int h = 30;
		double a = (1/2)*b*h;
		System.out.println("Triangle area is " + a);
	}
	public static void main(String [] args) {
		Triangles c = new Triangles();
		c.getArea();
	}

}
