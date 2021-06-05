
public class MethodDemo {
	
	
	
	
	//access modifier, return type, methodname
	public int sum(int x, int y) {
		
		return x+y;
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
		MethodDemo m = new MethodDemo(); //this is occupying some space in memory
		MethodDemo m1 = new MethodDemo(); //this is also occupying some space in memory
//		int z=m.sum(5, 4);
//		System.out.println(z*10);
//		
//		int l=m.sum(10, 40);
//		System.out.println(l*12);
//		
//		int n=m.sum(30, 25);
//		System.out.println(n*5);
		
		System.out.println(m.sum(5, 4)*10);
		
		
		

	}

}
