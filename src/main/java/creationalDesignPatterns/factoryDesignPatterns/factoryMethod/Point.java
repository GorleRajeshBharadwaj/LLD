package creationalDesignPatterns.factoryDesignPatterns.factoryMethod;

public class Point {

	private double x;
	private double y;
	
	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static Point newCartesianPoint(double x, double y) {
		return new Point(x, y);
	}
	
	public static Point newPolorPoint(double rho, double theta) {
		return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
	}
}
