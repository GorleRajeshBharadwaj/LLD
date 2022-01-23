package lld.dependencyInversionPrinciple.exampleOne.bruteImplementation;

import java.util.List;

public class Research {

	//high-level module -> it allow to person some operations on those low-level constructs.
	// -> this is kind of higher to end user, as the end user doesn't care about the storage implementation.
	//they care about actual research. They want the results
	
	//But DIP states high level module shouldn't depend on low level module.
	
	public Research(Relationships relationships) {
		///this is bad. As it depend on low level class
		
		List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
		
		relations.stream().filter(x -> 
			x.getParent().name == "John" &&
			x.getRelationship() == Relationship.PARENT).forEach(ch ->
					System.out.println(
							"John has a child name : " + ch.getChild().name
					));
	}
}
