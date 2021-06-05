package accessmodifers2;

import accessmodifiers.A;

public class E extends A {
	
	public static void main(String[] args) {
		A a = new A();
		E e = new E();
		
		System.out.println(a.name);
		System.out.println(e.email);
		//System.out.println(.lastName);
		a.displayName();
	}

}
