package Labsession23;

class bus extends Vehicle {
	public void move() {
		System.out.println("Bus is moving on six wheels");
	}
	 public static void main(String[] args) {
		Car c = new Car();
		c.move();
		
		bike b=new bike();
		b.move();
		
		bus bs = new bus();
		bs.move();
		
	}
	
	}
