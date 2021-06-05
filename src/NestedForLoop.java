
public class NestedForLoop {

	public static void main(String[] args) {
		
		int i=1;
		for(; i<=5; ) {
			int j=1;
			for(; j<=5;) {
				System.out.println(i+" "+j);
				j++;
			}//end of j
		 i++;
		}//end of i

	}

}
