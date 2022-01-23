package lld.liskovSubstitutionPrinciple.exampleOne;

public class ShapeFactory {
	
	public Rectangle getRectangle(int height, int weight) {
		return new Rectangle(height, weight);
	}
	
	public Rectangle getSquare(int size) {
		return new Rectangle(size, size);
	}

}
