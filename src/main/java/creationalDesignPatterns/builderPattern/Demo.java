package creationalDesignPatterns.builderPattern;

public class Demo {

	public static void main(String[] args) {
		HTMLBuilder htmlBuilder = new HTMLBuilder("ul");
		htmlBuilder.addChild("li", "hello");
		htmlBuilder.addChild("li", "world");
		System.out.println(htmlBuilder);
		
		//same with fluentBuilder
		//here invocation to add child returns the reference to the same builder
		FluentHTMLBuilder fluentHtmlBuilder = new FluentHTMLBuilder("ul");
		fluentHtmlBuilder.addChild("li", "hello")
		                 .addChild("li", "world");
		System.out.println(fluentHtmlBuilder);
	}

}
