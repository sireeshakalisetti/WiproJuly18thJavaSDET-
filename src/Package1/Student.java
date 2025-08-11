package Package1;

class Student {
	private static String StudentName = "Sireesha";
	private static String StudentDep = "IT";
	private static String StudentID = "23245";
	private void stu() {
		System.out.println(StudentName);
		System.out.println(StudentDep);
		System.out.println(StudentID);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.stu();// TODO Auto-generated method stub

	}

}
