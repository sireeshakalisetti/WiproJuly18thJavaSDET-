package Labsession23;

public class StringBuilderExample {

	public static void main(String[] args) {
		String s1 = "Hema";
		String s2 = "Sai";
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb);
		sb.append(s2);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.isEmpty());
		System.out.println(sb.substring(3));
		System.out.println(sb.indexOf("i"));
		System.out.println(sb.length());
		System.out.println(sb.insert(3,"in"));
		System.out.println(sb.charAt(6));
		System.out.println(sb.delete(2,3));
		System.out.println(sb.replace(0, 2, " "));// TODO Auto-generated method stub

	}

}
