package exceptinhandling;

public class MultipleCatchExample {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		try {
		System.out.println(a[10]);
		}catch(ArithmeticException ar) {
			System.out.println( "AE occurs");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("AIBE occurs");
		}catch(Exception e) {
			System.out.println("parent exception occurs");
		}finally {
			System.out.println("will always be executed");
		}
		
		System.out.println("rest of the code");

	}

}
