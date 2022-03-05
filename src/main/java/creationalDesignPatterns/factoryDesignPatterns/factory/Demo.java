package creationalDesignPatterns.factoryDesignPatterns.factory;

public class Demo {
	
	public static void main(String[] args) {
		PointAdv point = PointAdv.Factory.newCartesianPoint(3, 4);
	}

}
