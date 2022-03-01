package solidPrinciples.openClosedPrinciple.exampleOne.specification;

import solidPrinciples.openClosedPrinciple.exampleOne.Product;
import solidPrinciples.openClosedPrinciple.exampleOne.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;
	
	public SizeSpecification(Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.getSize() == this.size;
	}
}
