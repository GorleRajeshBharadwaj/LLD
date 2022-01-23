package lld.singleResponsibilityPrinciple.exampleOne;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

	private final List<String> entries = new ArrayList<>();
	private static int count = 0; // for indexing the journal
	
	//should allow to add and remove entries t journal
	
	public void addEntry(String text) {
		entries.add("" + (++count) + " : " + text);
	}
	
	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override
	public String toString() {
		//return "Journal [entries=" + entries + "]";
		return String.join(System.lineSeparator(), entries);
	}
	
	//adding few more methods to save the journal to file
	//this will break the SRP
	
	public void save(String filename) throws FileNotFoundException {
		try(PrintStream out = new PrintStream(filename)){
			out.println(toString());
		}
	}
	
	public void load(String fileName) {}
	
	public void load(URL url) {}
	
	//here Persistence is a separate concern and 
	//we are adding to Journal which violates the SRP
	
	//If we have lets say instead of journal you have may
	//be 20 or more different domain objects and you want to
	//save all of them to a file, at some point you would end up having change
	// the serialization code inside every one of those 20 objects.
	//let say whenever you want to change the mechanism of saving to a file, for example.
	
	//We can make new class Persistence to handle load and save functionalities
	
}
