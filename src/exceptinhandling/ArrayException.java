package exceptinhandling;

public class ArrayException {
	
	public static void main(String[] args) {
		int[] arr = {4, 0, 33, 10};
		
	try {
		System.out.println(arr[4]);
	}catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("do not terminate here");
	}
		
		System.out.println("line 1");
		System.out.println("line 2");

		
	}

}
