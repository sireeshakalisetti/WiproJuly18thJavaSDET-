package Collections;

import java.util.ArrayList;
import java.util.List;

public class EqualsMethod {

	int id;

	String name;

	 EqualsMethod(int id , String name) {

		this.id = id;

		this.name = name;

	}

	 // Overiding equal () to compare the object content

	 @Override

	 public boolean equals(Object obj) {

		 if (this == obj) return true ; // same reference

		 if(obj == null || getClass()!= obj.getClass()) return false;


		 Emlpoyee other  = (Emlpoyee)obj;

		 return this.id == other.id && this.name.equals(other.name);

	 }


	 @Override

	 public int hashCode() {

		 return Objects.hash(id ,name);

	 }

	 @Override

	 public String toString() {

			return id   + "_" + name;


		}


 
	public static void main(String[] args) {
 
 
		List<Emlpoyee>  empoyees = new ArrayList<>();

		empoyees.add(new Emlpoyee (103, "Ravi"));

		empoyees.add(new Emlpoyee (101, "Amit"));

		empoyees.add(new Emlpoyee (102, "Zara"));


		empoyees.add(new Emlpoyee (102, "Zara"));


		empoyees.add(new Emlpoyee (104, "John"));


		for (Emlpoyee e: empoyees ) {

			System.out.println(e);

		}
 
 
	}
 