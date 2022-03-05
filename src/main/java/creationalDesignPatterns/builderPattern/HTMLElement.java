package creationalDesignPatterns.builderPattern;

import java.util.ArrayList;
import java.util.Collections;

public class HTMLElement {
	
	public String name, text;
	public ArrayList<HTMLElement> elements = new ArrayList<>();
	
	//utils
	private final int indentSize = 2;
	private final String newline = System.lineSeparator();
	
	public HTMLElement() {
		
	}
	
	public HTMLElement(String name, String text) {
		this.name = name;
		this.text = text;
	}
	
	//takes level from root as input
	private String toStringImpl(int indent) {
		StringBuilder sb = new StringBuilder();
		String tags = String.join("", Collections.nCopies(indent*indentSize, " "));
		sb.append(String.format("%s<%s>%s", tags, name, newline));
		
		if(text != null && !text.isEmpty()) {
			sb.append(String.join("", Collections.nCopies((indent+1)*indentSize, " ")))
			  .append(text)
			  .append(newline);
		}
		
		for(HTMLElement ele: elements) {
			sb.append(ele.toStringImpl(indent+1));
		}
		sb.append(String.format("%s<%s>%s", tags, name, newline));
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return toStringImpl(0);
	}
}
