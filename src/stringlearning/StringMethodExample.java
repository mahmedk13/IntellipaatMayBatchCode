package stringlearning;

public class StringMethodExample {
	
	public static void main(String[] args) {
		
		String name1 = "My name is Mike"; //0
		String name2 = "          my name is John          ";
		
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name2.toUpperCase());
		System.out.println(name1.toLowerCase());
		System.out.println(name1.charAt(2));
		System.out.println(name1.contains("Mike"));
		System.out.println(name2.endsWith("kl"));
		System.out.println(name2.startsWith("my"));
		System.out.println(name1.replace('n', 'm'));
		System.out.println(name1.length());
		System.out.println(name1.isEmpty());
		System.out.println(name1.indexOf('e'));
		System.out.println(name1.substring(3));
		System.out.println(name1.substring(3, 8));
		System.out.println(name2.trim());
		
		
		
	}

}
