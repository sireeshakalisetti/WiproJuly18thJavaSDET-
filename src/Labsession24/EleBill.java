package Labsession24;

class EleBill extends Bill {
	public void generateBill() {
	        int units = 150;
	        double rate = 5.0;
	        double amount = units * rate;
	        System.out.println("Electricity Bill: " + amount);
	}
	
	
}
