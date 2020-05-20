package constructorExample;

public class Student {

	String studentName;
	int rollNum;

	public Student(String studentName, int rollNum) {
		this.studentName = studentName;

		this.rollNum = rollNum;
	}

	public  Student() {

	}

	public Student(String studentName, int rollNum, long mobile) {

	}

	public static void main(String[] args) {

		Student student1 = new Student("Rahul", 101,545456465);
		// student1.provideStudentInfo("Rahul", 101);

		Student student2 = new Student("Amit", 102);
		// student2.provideStudentInfo("Ashish", 102);

		Student student3 = new Student("Anil", 103);
		// student3.provideStudentInfo("Deepak", 103);

		Student student4 = new Student("Deepak", 104);
		// student4.provideStudentInfo("Nitin", 104);

		Student student5 = new Student("sachin", 105);
		// student5.provideStudentInfo("Naveen", 105);

		System.out.println(student1.studentName);
		System.out.println(student1.rollNum);

		System.out.println(student2.studentName);
		System.out.println(student2.rollNum);

		System.out.println(student5.studentName);//
		System.out.println(student5.rollNum);//

	}

	/*
	 * public void provideStudentInfo(String sName, int rNo) {
	 * 
	 * studentName = sName; rollNum = rNo; }
	 */
}
