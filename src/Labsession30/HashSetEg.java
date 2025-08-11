package Labsession30;
import java.util.*;


public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();
		s1.add("s");
		s1.add("u");
		s1.add("null");
		s1.add("p");
		
		System.out.println(s1);
		System.out.println(s1.contains("o"));
		System.out.println(s1.remove("u"));
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		
		
		
		

	}

}