package exceptinhandling;

public class ArithmeticExceptionExample {
	
	
	static int a;
	public static void main(String[] args) {
	try {
		 a = 40/0;
	}catch(ArithmeticException a) {
		System.out.println("division by 0 is undefined");
	}
	
	System.out.println(a);
		
	}

}
