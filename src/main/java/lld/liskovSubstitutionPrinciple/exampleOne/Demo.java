package lld.liskovSubstitutionPrinciple.exampleOne;

public class Demo {
	
	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		//area = width * 10;
		System.out.println(
				"Expected area is : " + (width*10) +
				", got : " + r.getArea());
		
	}

	public static void main(String[] args) {

		Rectangle rc = new Rectangle(2, 3);
		useIt(rc);
		
		Rectangle sq = new Square();
		sq.setWidth(5);
		useIt(sq);
		// this here will give wrong result.
		
		//how to avoid it?
		//you do not need square here actually,
		//you can do a detection in rectangle to check whether it is a square of not.
		
		//or
		//if you want explicit construction if rectangle and square, then you can use
		// a Factory Design pattern.
	}

}
