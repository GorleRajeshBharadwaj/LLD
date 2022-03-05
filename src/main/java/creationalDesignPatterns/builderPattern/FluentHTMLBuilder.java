package creationalDesignPatterns.builderPattern;

public class FluentHTMLBuilder {
    private String rootName;
	
	private HTMLElement root = new HTMLElement();
	
	public FluentHTMLBuilder(String rootName) {
		this.rootName = rootName;
		root.name = rootName;
	}
	
	//return builder so that the use case become more fluent as String Builder.
	//when you append to string String builder to get same builder as response.
	public FluentHTMLBuilder addChild(String childName, String childText) {
		HTMLElement childElement = new HTMLElement(childName, childText);
		root.elements.add(childElement);
		return this;
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
