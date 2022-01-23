package lld.liskovSubstitutionPrinciple.exampleOne;

public class Square extends Rectangle {

	public Square() { }
	
	public Square(int size) {
		width = height = size;
	}
	
	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	
	@Override
	public void setWidth(int width) {
		super.setHeight(width);
		super.setWidth(width);
	}
	
	//here by updating height and width of Rectangle, we are violating the LSP.
	//Rectangle now can't be used at every place instead of square, because the setHeight()
	//in square is effecting the width in rectangle also.
	
	//see example in Demo class

}
