package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		
		studentMap.put(123, "John");
		studentMap.put(124, "Mike");
		studentMap.put(125, "Ben");
		studentMap.put(null, null);
		studentMap.put(125, "Adam");
		
//		System.out.println(studentMap.get(125));
//		
//		studentMap.replace(123, "John sr");
//		studentMap.remove(124);
		
		studentMap.forEach(  (k,v)->System.out.println(k+" "+v)     );

		
		

	}

}
