package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {
	
	
	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		
		List<String> cities = new ArrayList<String>();
		
		cities.add("Washington");
		cities.add("Delhi");
		
//		List<Integer> nums = new ArrayList<Integer>();
//		
//		nums.add(1);
//		nums.add(40000);
		
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Maruti");
		cars.add("BMW");
		
		
		
		
//		System.out.println(cars.get(3));
//		System.out.println(cars.contains("Mercedes"));
//		System.out.println(cars.equals(cities));
//		System.out.println(cars.indexOf("Maruti"));
//		System.out.println(cars.lastIndexOf("BMW"));
//		System.out.println(cars.remove("Maruti"));
//		System.out.println(cars.remove(2));
//		cars.add("Hyundai");
//		System.out.println(cars.size());
//		System.out.println(cars);
		
//		for(int i=0; i<cars.size(); i++) {
//			System.out.println(cars.get(i));
//		}
		
//		for(String str: cars) {
//			System.out.println(str);
//		}
		
		//enhanced for loop
		//for each loop
		
		Iterator itr = cars.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}
	
	
	
	
	
	

}
