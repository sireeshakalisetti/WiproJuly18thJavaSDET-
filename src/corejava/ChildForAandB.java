package corejava;

public class ChildForAandB implements InterfaceA, InterfaceB {
	

	public static void main(String[] args) {
		ChildForAandB ab = new ChildForAandB();
		InterfaceA.display();
		InterfaceB.display();
		
		/*InterfaceA aRef = ab;
        aRef.display();
 
        InterfaceB bRef = ab;
        bRef.display();*/

	}

}
