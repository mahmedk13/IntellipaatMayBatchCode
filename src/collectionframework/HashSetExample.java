package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import accessmodifers2.E;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<Integer>();
		
		nums.add(13); //hashcode
		nums.add(42); //hashcode
		nums.add(45); 
		nums.add(12);
		nums.add(42);

		
		
		System.out.println(nums);
		//System.out.println(nums.size());
		
//		for(Integer number: nums) {
//			System.out.println(number);
//		}
		
		Iterator<Integer> itr = nums.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
