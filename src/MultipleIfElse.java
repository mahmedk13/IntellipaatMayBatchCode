
public class MultipleIfElse {
	

	public static void main(String[] args) {
		
		int marks =65;
		
		
		//&&-->> checks both conditions
		
		//&&-- first pass and second pass --> true
		//&&--> first pass and second fail--> false
		//&&--> first fail and second pass --> false
		//&& --> second pass and first pass--> true
		
		// || --> checks only one condition
		
//		if(marks>80) {
//			System.out.println("passed with distinction");
//		}else if (marks>60 && marks<80) {
//			System.out.println("passed with first division");
//		} else if (marks>45 && marks<60) {
//			System.out.println("passed with second division");
//		}else if (marks>33 && marks<45) {
//			System.out.println("passed with third division");
//		}else {
//			System.out.println("student is not passed");
//		}
		
		
		int empid=123;
		String designation ="manager";
		
	
		
		
		if(empid==123 || designation.equals("manager")) {
			System.out.println("emp name is Mike");
		}else {
			
		}
		
		

	}
	

}
