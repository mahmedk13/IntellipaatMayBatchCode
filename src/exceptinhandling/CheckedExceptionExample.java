package exceptinhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {
	
	public void workingWithFile() {
		try {
			FileInputStream fis = new FileInputStream("input.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
	}

}
