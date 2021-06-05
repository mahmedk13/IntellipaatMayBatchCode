
public class Student {
	
	int rollNo;
	String name;
	static String college="Tata College";
	int marks;
	
	//static variable is shared to all objects
	
	Student(int r, String n){
		rollNo =r;
		name=n;
	}
	
	public void display() {
		System.out.println(rollNo+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		Student st = new Student(123, "John");
		Student st1 = new Student(123, "Mike");
		
		st.display();
		st1.display();

		
		
		
		
		
	}

}
