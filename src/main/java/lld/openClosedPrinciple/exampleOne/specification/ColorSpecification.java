package lld.openClosedPrinciple.exampleOne.specification;

import lld.openClosedPrinciple.exampleOne.Color;
import lld.openClosedPrinciple.exampleOne.Product;

public class ColorSpecification implements Specification<Product> {
	
	private Color color;
	
	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.getColor() == this.color;
	}

}
