package Labsession24;

//College Admission System
//Abstract class Student:
//Fields: name, rollNo
//Abstract method: getGrade()
//Subclasses:
//EngineeringStudent
//MedicalStudent
//Each implements getGrade() based on marks.

abstract class Student {
	String name;
	int rollNo;
	abstract void getGrade();
	
}


class EnggStud extends Student {
	int marks;
	EnggStud(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void getGrade() {
		if (marks>=90) {
			System.out.println("Grade: "+"A");
		}
		else if(marks >=75) {
			System.out.println("Grade: "+"B");
		}
		else {
			System.out.println("Grade: "+"C");
		}
	}
	
}

class medStud extends Student {
	int marks;
	medStud(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void getGrade() {
		if (marks>=90) {
			System.out.println("Grade: "+"A");
		}
		else if(marks >=75) {
			System.out.println("Grade: "+"B");
		}
		else {
			System.out.println("Grade: "+"C");
		}
	}
	
}




