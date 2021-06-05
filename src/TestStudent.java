
public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student(125, "Alex");
		System.out.println(s.name);
		System.out.println(s.rollNo);
		System.out.println(Student.college);
		s.display();
		
		//it is shared to all objects
		//all objects have common college variables
		//college variable is tied to class, not objects

		
	}

}
