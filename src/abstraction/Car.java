package abstraction;

public abstract class Car {
	
	static int i=10;
	
	//you will only declare
	//you will not define-- you will not provide implementation
	public abstract void run();
	
	static void printCarModel() {
		System.out.println("value of i is"+i);
		System.out.println("car model is mercedez benz");
	}
	
	//1. an abstract class can have abstract and non abstract methods
	//2. if a class has even a single abstract method then class should become abstract class
	//3. abstract class not be instantiated or its object cant be created

}
