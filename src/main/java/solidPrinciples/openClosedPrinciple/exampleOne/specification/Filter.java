package solidPrinciples.openClosedPrinciple.exampleOne.specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
	
	public Stream<T> filter(List<T> items, Specification<T> spec);

}
