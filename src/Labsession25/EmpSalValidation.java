package Labsession25;

public class EmpSalValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp("supraja", 5,-33444);
		Emp e1 = new Emp("ssjj", 2, 34564);
		Emp e2 = new Emp("niki", 7, 55666);
		Emp e3 = new Emp("bhanu", 3, 45678);
		
		e.setSal(-7889);
		
		e.displayDetails();
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		

	}

}
