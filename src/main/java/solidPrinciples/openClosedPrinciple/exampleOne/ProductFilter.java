package solidPrinciples.openClosedPrinciple.exampleOne;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

	public Stream<Product> filterByColor(List<Product> products, Color color) {
		return products.stream().filter(p -> p.getColor() == color);
	}
	
	//if your manger ask you to add new filter for size
	public Stream<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(p -> p.getSize() == size);
	}
	
	//what if new filter is needed for both size and color
	public Stream<Product> filterbySizeAndColor(
			List<Product> products,
			Size size,
			Color color) {
		return products.stream().filter(p -> p.getColor() == color && 
				p.getSize() == size);
	}
	
	//now what if there are even more enums to specify the product
	//you cannot keeping on writing methods for each every combinations
}
