package Collections;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Siri");
		a1.add("Mameeth");
		a1.add(null);
		a1.add("Prakash");
		a1.add("vijaya");
		a1.add("venkata rao");
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.indexOf("Mameeth"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(2));
		System.out.println(a1);
		System.out.println(a1.set(4, "Sireesha"));
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1);
	}

}
