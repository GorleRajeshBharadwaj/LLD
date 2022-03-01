package solidPrinciples.openClosedPrinciple.exampleOne.specification;

import solidPrinciples.openClosedPrinciple.exampleOne.Color;
import solidPrinciples.openClosedPrinciple.exampleOne.Product;

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
