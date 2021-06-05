
public class BreakExampleWithTwoLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=3; j++) {
				if(i==2 && j==2) { //i=2, J=1, i=2, j=2
					break;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
