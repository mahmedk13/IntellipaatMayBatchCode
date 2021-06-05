
public class Student1 {
	
	String studentName; //
	int rollNumber;
	int marks;
	String subject;
	
	
	
	
	public static void main(String[] args) {
		
		Student1 s = new Student1(); //Object creation
		s.studentName="John";
		s.rollNumber=123;
		s.marks=80;
		s.subject="comp science";
		
		Student1 s1 = new Student1();
		//s2
		//s3
		//s4
		s1.studentName="Mike";
		s1.rollNumber=124;
		s1.marks=81;
		s1.subject="social science";
		
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
