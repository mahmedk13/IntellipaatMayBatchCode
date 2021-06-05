
public class Counter {
	
	
	//variables declared inside constructor, methods, if block, for loops are called local variables
	//variables declared at class level are called instance or global variables
	static int count=0;
	
	Counter(){
		int x=6;
		count++; //1
		System.out.println(x);
		System.out.println(count); //1
	}
	
	

	public static void main(String[] args) {
		//constructor is executed as soon as you create object of the class
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		
	}

}
