package solidPrinciples.dependencyInversionPrinciple.exampleOne.modifiedImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import solidPrinciples.dependencyInversionPrinciple.exampleOne.bruteImplementation.Person;
import solidPrinciples.dependencyInversionPrinciple.exampleOne.bruteImplementation.Relationship;
import solidPrinciples.dependencyInversionPrinciple.exampleOne.bruteImplementation.Triplet;

public class Relationships implements RelationshipBrowser {
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
	
	//Now the search is not happening on high-level module, it is happening on low-level module.
	//The reason is, now if you decide to change the implementation of List to something else let say Array.
	//then you need to change a lots code in high-level module. And this is a problem.
	
	//So, instead we doing everything at low-level module.
	
	//here, now you can change you implementation how-ever you like, it will not effect the high-level module

	@Override
	public List<Person> findAllChildrenOf(String name) {
		return relations.stream().filter( x-> x.getParent().name.equals("John") && 
				x.getRelationship().equals(Relationship.PARENT)).map(x -> x.getChild()).collect(Collectors.toList());
	}
	
	

}
