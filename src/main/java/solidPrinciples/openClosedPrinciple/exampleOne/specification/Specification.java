package solidPrinciples.openClosedPrinciple.exampleOne.specification;

public interface Specification<T> {

	public boolean isSatisfied(T item);
}
