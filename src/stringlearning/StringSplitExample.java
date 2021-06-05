package stringlearning;

public class StringSplitExample {
	
	public static void main(String[] args) {
		
		String names = "India Aus USA UK Japan";
		
		String vowels = "aeiou";
		char[] charArr = vowels.toCharArray();
		
		System.out.println(charArr[4]);
		
		//String objects are immutable
		
		
		
		
		String[] arrOfCountries = names.split(" ");
		
		String nation = arrOfCountries[0];
		System.out.println(nation.equals("India"));
		
		
		for(int i =0; i<arrOfCountries.length; i++) {
			System.out.println(arrOfCountries[i]);
		}
	}

}
