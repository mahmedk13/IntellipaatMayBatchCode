
public class StudentDemo {
	
	String studentName; //
	int rollNumber;
	int marks;
	String subject;
	
	//global variable
	
	StudentDemo(){
		
	}
	
	//parameterize constructor
	StudentDemo(String studentName, int rollNumber, int marks, String subject){
		this.studentName = studentName; //hey compiler I am referring to studentName variable of StudentDemo class
		this.rollNumber=rollNumber;
		this.marks =marks;
		this.subject =subject;
		
	}
	
	StudentDemo(String studentName, int rollNumber){
		this.studentName = studentName; //hey compiler I am referring to studentName variable of StudentDemo class
		this.rollNumber=rollNumber;	
	}
	
	
	
	//Exception handling--compile time exception handling
	public static void main(String args[]) {
		
		StudentDemo s2 = new StudentDemo();
		StudentDemo s3 = new StudentDemo("Chris", 125);
		
		StudentDemo s = new StudentDemo("John", 123, 80, "comp science");
		StudentDemo s1 = new StudentDemo("Mike", 124, 83, "social science");
		
		System.out.println(s.studentName);
		System.out.println(s.rollNumber);
		System.out.println(s.marks);
		System.out.println(s.subject);
		
		System.out.println(s1.studentName);
		System.out.println(s1.rollNumber);
		System.out.println(s1.marks);
		System.out.println(s1.subject);

		
		
		
	}

}
