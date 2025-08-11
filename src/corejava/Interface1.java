package corejava;

public interface Interface1 {
	abstract void display();
	void read();
	public static final String empName = "Siri";
	int empId = 471;
	static void write() {
		System.out.println("Writing in interface");
	}
	default void show() {
		System.out.println("Showing");
	}

}
