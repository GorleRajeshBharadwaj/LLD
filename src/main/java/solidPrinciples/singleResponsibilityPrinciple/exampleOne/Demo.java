package solidPrinciples.singleResponsibilityPrinciple.exampleOne;


public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Journal journal = new Journal();
		journal.addEntry("Eat the food");
		journal.addEntry("Go to sleep");
		System.out.println(journal);
		
		
		Persistence p = new Persistence();
		String filename = "E:\\GIT HUB\\journal.txt";
		p.saveToFile(journal, filename, true);
		
		Runtime.getRuntime().exec("notepad.exe " + filename);
	}

}
