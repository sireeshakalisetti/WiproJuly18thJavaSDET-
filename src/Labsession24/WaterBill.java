package Labsession24;

class waterbill extends Bill {
	public void generateBill() {
        int liters = 500;
        double rate = 2.0;
        double amount = liters * rate;
        System.out.println("Water Bill: " + amount);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EleBill eb = new EleBill();
		eb.generateBill();
		
		waterbill wb = new waterbill();
		wb.generateBill();
		

	}

}
