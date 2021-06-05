package inheritancelearning;

public class Dog extends Animal {
	
	Dog(){
		System.out.println("dog object is created");
	}
	
	void bark() {
		System.out.println("barking");
	}
	
	void eat() {
		System.out.println("dog is eating");
	}

}
