package solidPrinciples.dependencyInversionPrinciple.exampleOne.modifiedImplementation;

import java.util.List;

import solidPrinciples.dependencyInversionPrinciple.exampleOne.bruteImplementation.Person;

public interface RelationshipBrowser {
	// this is the abstraction you are expected to implement on the low level module.
	
	List<Person> findAllChildrenOf(String name);

}
