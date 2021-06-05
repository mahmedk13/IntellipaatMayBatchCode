package filereadingwriting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingExample {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("D:\\test.txt");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
//		for(String str: lines) {
//			System.out.println(str);
//		}
		
		System.out.println("added new line");
		
		lines.forEach(str->System.out.println(str));
		


	}

}
