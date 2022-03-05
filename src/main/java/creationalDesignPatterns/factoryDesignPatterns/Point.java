package creationalDesignPatterns.factoryDesignPatterns;

public class Point {
	private double x, y;
	
	/**
	 * 
	 * @param x -> x co ordinate when Cartesian, value when polar
	 * @param y -> y co ordinate when Cartesian, thetha when polar
	 * @param cs
	 */
	//never do this type of coding, it is very ugly
	public Point(double x, double y, CoordinateSystem cs) {
		switch(cs) {
		case CARTESIAN:
			this.x = x;
			this.y = y;
			break;
		case POLAR:
			this.x = x*Math.cos(y);
			this.y = x*Math.sin(y);
			break;
		}
	}
	//work around is to have another argument to decide 
	//whether it is Cartesian co-ordinates or polar co-ordinates
	
	/*public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}*/
    
	//we can not use this as java will not allow another constructor with same arguments
	/*public Point(double value, double theta) {
		this.x = value*Math.cos(theta);
		this.y = value*Math.sin(theta);
	}*/
}
