package solidPrinciples.dependencyInversionPrinciple.exampleOne.bruteImplementation;

import java.util.ArrayList;
import java.util.List;

public class Relationships {
	//low-level(because it is related to data storage,
	//keeps the list and gives access to it. it doesn't have any business logic)
	//-> SRP, allow only modification on relations
	
	private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();
	
	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

	public void addParentAndChild(Person parent, Person child) {
		relations.add(new Triplet<>(parent, Relationship.PARENT, child));
		relations.add(new Triplet<>(child, Relationship.CHILD, parent));
	}

}
