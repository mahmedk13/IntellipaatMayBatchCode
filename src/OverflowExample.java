
public class OverflowExample {

	public static void main(String[] args) {

		//byte has range -128 to 127--> byte b =128;
		//short --    -32768 to 32767
		
		int a =130;
		byte b = (byte)a;
		System.out.println(b);
		//1.....127----130-127--> -128, -127, -126
		
		
		int x =68;
		char c =(char)x;
		//char c =68;
		System.out.println(c);
		
	}

}
