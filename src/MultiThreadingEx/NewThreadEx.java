package MultiThreadingEx;

public class NewThreadEx extends Thread {

	
		// TODO Auto-generated method stub
		
		
		public void run() {
			System.out.println("Thread is running");
		}

	}
	
	class Test {
		public static void main(String[] args) {
			NewThreadEx t1 = new NewThreadEx();
			t1.start();
		}
	}

	
	class Test1 {
		public static void main(String[] args) {
			NewThreadEx t1 = new NewThreadEx();
			t1.start();
		}
}
