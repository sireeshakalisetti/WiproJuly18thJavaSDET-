package corejava;

public class OperationsOfString {

	public static void main(String[] args) {
		String s1 = "Sireesha";
		String s2 = "Hema";
		String s3 = "Kalisetti";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		char[] ch = {'H','e','l','l','o'};
		String s4 = new String(ch);
		System.out.println(s4);
		String s5 = new String("World");
		System.out.println(s5);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("S"));
		System.out.println(s1.replace("i", "e"));
		System.out.println(s1.replaceAll(s1, "Siri"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.endsWith("a"));
		String s6 = String.join("-",s1,s2);
		System.out.println(s6);
		System.out.println(s1.compareTo(s6));//lexo graphical comparison
		String s7 = "Kalisetti Hema Sai Sireesha";
		String[] result = s7.split(" ");
		for(String str : result) {
			System.out.println(str+",");// TODO Auto-generated method stub
		}

	}

}
