package lld.dependencyInversionPrinciple.exampleOne.modifiedImplementation;

import java.util.List;

import lld.dependencyInversionPrinciple.exampleOne.bruteImplementation.Person;

public class Research {

	//high-level module -> it allow to person some operations on those low-level constructs.
	// -> this is kind of higher to end user, as the end user doesn't care about the storage implementation.
	//they care about actual research. They want the results
	
	public Research(RelationshipBrowser browser) {
		List<Person> children = browser.findAllChildrenOf("John");
		
		for(Person child: children) {
			System.out.println("John has a child called " + child.name);
		}
	}
}
