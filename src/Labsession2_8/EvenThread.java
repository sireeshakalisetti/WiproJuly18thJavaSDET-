package Labsession2_8;

class EvenThread extends Thread {
	public void run() {
		for (int i = 2;i<=10;i+=2) {
			System.out.println("even:"+i);
		}
	}
}

class OddThread extends Thread {
	public void run() {
		for (int i = 1;i<=10;i+=2) {
			System.out.println("odd:"+i);
		}
	}
}
