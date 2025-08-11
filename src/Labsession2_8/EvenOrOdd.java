package Labsession2_8;

public class EvenOrOdd {
	public static void main(String[] args) {
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		
		et.start();
		ot.start();
		
	}
}
