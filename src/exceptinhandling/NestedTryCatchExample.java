package exceptinhandling;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		
		try {
		int a = 50/0;
		}catch(Exception e) {
			try {
				int b = 100/0;
			}catch(Exception e1) {
				System.out.println("inside nested catch block");
			}
		 System.out.println("inside catch block");
		}
		
		System.out.println("rest of the code");
		
		

	}

}
