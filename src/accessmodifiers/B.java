package accessmodifiers;

public class B {
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.name);
		//System.out.println(a.lastName);
		System.out.println(a.email);
		System.out.println(a.address);
		a.displayName();

	}
	
	

}
