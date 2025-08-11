package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListUsingDeque {

		public static void main(String[] args) {
			Deque<String> lang = new LinkedList<>();
			lang.add("Java");
			lang.add("C++");
			lang.add("C Lang");
			lang.add("C#");
			lang.add("Python");
			System.out.println(lang);
			System.out.println(lang.pollFirst());
			System.out.println(lang);
			System.out.println(lang.getFirst());
			System.out.println(lang);
			System.out.println(lang.peekFirst());
			System.out.println(lang);
			System.out.println(lang.remove("C#"));
			System.out.println(lang);
			System.out.println(lang.poll());
			System.out.println(lang);

	}

}
