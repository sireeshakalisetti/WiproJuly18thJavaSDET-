package corejava;

public class ExceptionHandling {
	public static void checkAge(int age) throws Exception {
		if(age>18) {
			System.out.println("Create a new exception.");
			Thread.sleep(5000);
			throw new Exception("Age must be 18 or older than 18 to vote.");
		}
		else {
			System.out.println("Person is not eligible for voting");
		}
	}

	public static void main(String[] args) throws Exception {
		ExceptionHandling e = new ExceptionHandling();
		try {
			int a = 100;
			int b = 0;
			int d = a/b;
			String c = null;
			int arr[] = null;
			System.out.println(d);
			System.out.println(c.length());
			// TODO Auto-generated method stub
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

		finally {
			System.out.println("At any cost the code need to be printed.");
		}
		e.checkAge(19);
	}

}
