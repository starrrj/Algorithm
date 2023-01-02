package fileInputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Aaa {

	public static void main(String[] args) {
		
		String fileName = "C:/temp/test/ttt.txt";
		 
		try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
