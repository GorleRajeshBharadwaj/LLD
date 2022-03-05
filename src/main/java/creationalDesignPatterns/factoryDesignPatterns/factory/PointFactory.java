package creationalDesignPatterns.factoryDesignPatterns.factory;

import creationalDesignPatterns.factoryDesignPatterns.factory.Point;

public class PointFactory {
	
	public static Point newCartesianPoint(double x, double y) {
		return new Point(x, y);
	}
	
	public static Point newPolorPoint(double rho, double theta) {
		return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
	}

}
