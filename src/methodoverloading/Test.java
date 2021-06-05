package methodoverloading;

public class Test {
	
	public static void main(String[] args) {
		Adder a = new Adder();
		a.sum(10, 20); //int will be promoted to long
		a.sum(10, 20, 30);
		
	}

}
