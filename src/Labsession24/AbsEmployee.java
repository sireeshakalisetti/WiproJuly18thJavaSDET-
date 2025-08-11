package Labsession24;

public class AbsEmployee {
	    public static void main(String[] args) {
	        Employee emp1 = new PermanentEmployee(50000);
	        Employee emp2 = new ContractEmployee(500, 4);

	        System.out.println(emp1.calculateSalary());
	        System.out.println(emp2.calculateSalary());
	    }
	}
