package reCap;

public class Classandmethod {

	int rollno = 209;
	String name = "Alvin";	

	String student_name ;
	int student_rollno;
	public Classandmethod(String name, int rollno) {
		student_name = name;
		student_rollno = rollno;
	}

	public void data () {
		System.out.println("The roll number is "+ rollno + " & name is " + name);
	}

	public String data2 (String name) {
		student_name = name;
		System.out.println("The roll number is "+ student_rollno + " & name is " + student_name);
		return name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Classandmethod student = new Classandmethod("Arun", 01);
		String studentdata = student.data2("Vikram");
		System.out.println("Student data updated "+ studentdata);
		student.data();

	}

}
