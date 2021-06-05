package polymorphismlearning;

public class Test {
	
	
	public static void main(String[] args) {
		Animal a = new Dog(); //upcasting --> refrence variable of parent referring child object
		a.eat(); //run time polymorphism 
		System.out.println(a.i);
		
		
		//RBI Bank class--> getRateOfInterestMethod()
		//SBI bank class--> getRateOfInterestMethod()
		//ICICI bank -->
		//Axis Bank --> getRateOfInterestMethod()
		
	//	Bank b;
   // b = new SBI();
		//b.get....// sbi
		//b = new ICICI()'
		//b.get...//icici
		//b = new Axis()
		//b.get...//axis 
		
	}
	
	

}
