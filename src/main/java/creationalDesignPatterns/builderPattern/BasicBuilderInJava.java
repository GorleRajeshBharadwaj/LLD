package creationalDesignPatterns.builderPattern;

public class BasicBuilderInJava {
	
	public static void main(String[] args) {
		String hello = "Hello";
		System.out.println("<p>" + hello + "</p>");
		
		//what if we have a many words to insert, we can not use
		//string concatenation for all the words.
		
		//String Builder helps us to do it step by step
		
		String[] words = {"hello", "world"};
		StringBuilder sb = new StringBuilder();
		
		sb.append("<ul>\n");
		for (String word: words) {
			sb.append(String.format("  <li>%s</li>\n", word));
		}
		sb.append("</ul>");
		System.out.println(sb);
	}

}
