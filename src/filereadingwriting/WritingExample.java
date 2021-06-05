package filereadingwriting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingExample {

	public static void main(String[] args) throws IOException {
		
		String content = "Hello, we are learning Java"+
						" for selenium"+
						"so that we can use it for automation";
		
		Path path = Paths.get("D:\\test.txt");
		Files.write(path, content.getBytes(StandardCharsets.UTF_8));
		

	}

}
