package lld.openClosedPrinciple.exampleOne.specification;

import java.util.List;
import java.util.stream.Stream;

import lld.openClosedPrinciple.exampleOne.Product;

public class BestFilter implements Filter<Product> {

	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
		return items.stream().filter(p -> spec.isSatisfied(p));
	}
	
	

}
