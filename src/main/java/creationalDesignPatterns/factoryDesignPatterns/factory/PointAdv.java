package creationalDesignPatterns.factoryDesignPatterns.factory;

public class PointAdv {
	
	private double x, y;
	
	private PointAdv(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static class Factory {
		public static PointAdv newCartesianPoint(double x, double y) {
			return new PointAdv(x, y);
		}
		
		public static PointAdv newPolorPoint(double rho, double theta) {
			return new PointAdv(rho*Math.cos(theta), rho*Math.sin(theta));
		}
	}
}
