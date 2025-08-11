package corejava;

public class MultiLevelChild2 extends MultiLevelChild1 {
	int seating = 4;
	public void display4() {
		System.out.println("Brand of the car is " + brand);
		System.out.println("Seating arrangement is " + seating);
	}

	public static void main(String[] args) {
		MultiLevelChild2 c2 = new MultiLevelChild2();
		c2.display1();
		c2.display3();
		c2.display4();// TODO Auto-generated method stub

	}

}
