package accessmodifiers;

public class A {
	
public String name = "John";
private String lastName = "Adam";
protected String email = "abc@xyz.com";
String address = "India";
	
	public void displayName() {
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(address);
	}
	
	private void displayLastName() {
		System.out.println(lastName);

		
	}

}
