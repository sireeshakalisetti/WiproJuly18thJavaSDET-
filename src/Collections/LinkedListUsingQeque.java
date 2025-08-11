package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListUsingQeque {

	public static void main(String[] args) {
		Queue<String> lang = new LinkedList<>();
		lang.add("Java");
		lang.add("C++");
		lang.add("C Lang");
		lang.add("C#");
		lang.add("Python");
		System.out.println(lang);
		System.out.println(lang.peek());
		System.out.println(lang.remove("C#"));
		System.out.println(lang.poll());
		
		

	}

}
