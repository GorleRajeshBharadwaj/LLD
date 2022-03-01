package solidPrinciples.singleResponsibilityPrinciple.exampleOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

	public void saveToFile(Journal journal,
			String filename,
			boolean overwrite) throws FileNotFoundException {
		if(overwrite || new File(filename).exists()) {
			try(PrintStream out = new PrintStream(filename)){
				out.println(journal.toString());
			}
		}
	}
	
	public void load(String fileName) {}
	
	public void load(URL url) {}
}
