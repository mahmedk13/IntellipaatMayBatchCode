package exceptinhandling;

public class NumberFormatExceptionExample {
	
	public static void main(String[] args) {
		String s = "123";
		
		try {
		int i = Integer.parseInt(s); //123
		}finally {
			System.out.println("execute me");
		}
		
		//try- catch- finally
		//try - finally
		
	}

}
