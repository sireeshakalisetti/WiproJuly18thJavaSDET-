package Labsession25;

public class Temperature {
	
	private double celsius;
	
	public void setCelsius(double celsius) {
		
		if (celsius >= -273.15) {
			this.celsius = celsius;
		}
		else {
			System.out.println("invalid");
		
		}
	}
	
	double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    double toKelvin() {
        return celsius + 273.15;
    }
    
    
    double getCelsius() {
        return celsius;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t1 = new Temperature();
        t1.setCelsius(255);
        System.out.println("Celsius:" + t1.getCelsius());
        System.out.println("Fahrenheit:" + t1.toFahrenheit());
        System.out.println("Kelvin:" + t1.toKelvin());

        Temperature t2 = new Temperature();
        t2.setCelsius(-500);
        System.out.println("Celsius:" + t2.getCelsius());
        System.out.println("Fahrenheit:" + t2.toFahrenheit());
        System.out.println("Kelvin:" + t2.toKelvin());

	}

}
