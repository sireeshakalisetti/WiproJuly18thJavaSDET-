package Labsession24;

public class Rectangles implements Shapes{
	int l = 5;
	int w = 20;
	int c = l*w;
	public void getArea() {
		System.out.println("Rectangles area is " + c);
	}
	public static void main(String [] args) {
		Rectangles c = new Rectangles();
		c.getArea();
	}

}
