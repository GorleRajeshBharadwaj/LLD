package creationalDesignPatterns.builderPattern;

public class HTMLBuilder {
	
	private String rootName;
	
	private HTMLElement root = new HTMLElement();
	
	public HTMLBuilder(String rootName) {
		this.rootName = rootName;
		root.name = rootName;
	}
	
	public void addChild(String childName, String childText) {
		HTMLElement childElement = new HTMLElement(childName, childText);
		root.elements.add(childElement);
	}

	public void clear() {
		this.root = new HTMLElement();
		root.name = rootName;
	}
	
	@Override
	public String toString() {
		return root.toString();
	}
}
