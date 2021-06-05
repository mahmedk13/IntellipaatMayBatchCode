package arraylearning;

import java.util.Scanner;

public class CalculateStudentWeight {
	
	public static void main(String[] args) {
		int[] weightsOfStudents = {52, 48, 46, 50, 62, 66}; //5-1=4--> weights[4]
		String[] names = {"John", "Mike", "Adam", "Andy"};
		char[] arr = {'A', 'b', 'D', 'j', 'Z'};
		
		System.out.println(weightsOfStudents[6]); //66
		
		int[] weights = new int[5];
		
		Scanner scan = new Scanner(System.in);
		weights[0] = scan.nextInt();
		
		//array is a fixed container
		
		
		
		int avgWeight = (weights[0]+weights[1]+weights[2]+weights[3]+weights[4])/weights.length;
		System.out.println(avgWeight);
//		System.out.println(weights[0]);
//		System.out.println(weights[1]);
//		System.out.println(weights[2]);
//		System.out.println(weights[3]);
//		System.out.println(weights[4]);
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]); //weigts[4]
		}

		



		
		
		
		
		
		
		
		
		
		
		
		
	}

}
