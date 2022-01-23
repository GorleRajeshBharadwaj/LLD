package lld.dependencyInversionPrinciple.exampleOne.bruteImplementation;

public class Triplet<S1, S2, S3> {
	
	S1 parent;
	S2 relationship;
	S3 child;
	
	public Triplet(S1 parent, S2 relationship, S3 child) {
		this.parent = parent;
		this.child = child;
		this.relationship = relationship;
	}
	
	public S1 getParent() {
		return parent;
	}

	public S2 getRelationship() {
		return relationship;
	}

	public S3 getChild() {
		return child;
	}

}
