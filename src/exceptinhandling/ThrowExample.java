package exceptinhandling;

public class ThrowExample {
	
	static void validate(int age) {
		//you are expecting input above 18
		if(age<18) {
			throw new ArithmeticException("this is not a valid input");
		}else {
			System.out.println("welcome to vote");
		}
	}
	//throw vs throws
	//can we create our exception class? 
	
	public static void main(String[] args) {
		
		validate(13);
		System.out.println("rest of the code");
	}

}
