package inheritancelearning;

public class Child extends Parent {
	
	Child(){
		super();
		System.out.println("Child object is created");
	}
	
	int i=30;
	
	public void multiply() {
		System.out.println(super.sum(25, 50)); //75
		System.out.println(sum(10, 20)); // 300
	}
	
	public void print() {
		System.out.println(super.i);
		System.out.println(i);
	}
	
	public int sum(int x, int y) {
		
		return (x+y)*10;
	}

}
