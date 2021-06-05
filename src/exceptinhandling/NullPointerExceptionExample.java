package exceptinhandling;

public class NullPointerExceptionExample {
	
	static String s;

	public static void main(String[] args) {
		
		try {
		System.out.println(s.length());
		}catch(NullPointerException n) {
			System.out.println("String is null");
		}
		
		
		
		
		
		
	}

}
