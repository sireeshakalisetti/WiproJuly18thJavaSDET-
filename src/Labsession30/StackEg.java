package Labsession30;


import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
	Stack<String> lang = new Stack<>();
		lang.add("Telugu");
		lang.add("English");
		lang.add("Hindi");
		lang.add("Tamil");
		lang.add("Kanada");
		System.out.println(lang);
		System.out.println(lang.peek());
		System.out.println(lang);
		System.out.println(lang.pop());
		System.out.println(lang);
		System.out.println(lang.push("Malayalam"));
		System.out.println(lang);
		System.out.println(lang.search("Malayalam"));
		System.out.println(lang);
	}

}
