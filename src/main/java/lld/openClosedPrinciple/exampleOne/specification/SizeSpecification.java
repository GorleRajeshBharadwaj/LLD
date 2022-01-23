package lld.openClosedPrinciple.exampleOne.specification;

import lld.openClosedPrinciple.exampleOne.Product;
import lld.openClosedPrinciple.exampleOne.Size;

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
