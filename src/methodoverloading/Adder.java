package methodoverloading;

public class Adder {
	
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void sum(int a, long b) {
		System.out.println(a+b);
	}

}
