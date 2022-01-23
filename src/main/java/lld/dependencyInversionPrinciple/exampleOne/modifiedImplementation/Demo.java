package lld.dependencyInversionPrinciple.exampleOne.modifiedImplementation;

import lld.dependencyInversionPrinciple.exampleOne.bruteImplementation.Person;

public class Demo {
	
	//

	public static void main(String[] args) {
		Person parent = new Person("John");
		Person childOne = new Person("Chris");
		Person childTwo = new Person("Matt");
		
		Relationships relationships = new Relationships();
		relationships.addParentAndChild(parent, childOne);
		relationships.addParentAndChild(parent, childTwo);
		
		new Research(relationships);
	}

}
