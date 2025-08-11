package Labsession23;

public class Dog implements Animal{
	public void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal.bark();
		d.bark();// TODO Auto-generated method stub

	}

}
