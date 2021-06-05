package stringlearning;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = "Hello"; //literal 
		String str2 = "Hello"; 
		
		String s1 = new String("Welcome");
		String s2 = new String("Welcome");
		
		char[] ch = {'a', 'e', 'i', 'o', 'u'};
		String s3 = new String(ch);
		System.out.println(s3);
		
		
		System.out.println(str1==str2); //true
		System.out.println(s1==s2); //false
		
		System.out.println(s2);
		
		

	}

}
