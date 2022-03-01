package solidPrinciples.interfaceSegregationPrinciple.exampleOne;

public class OldFashionedPrinter  implements Machine {

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		
	}

	
	// old fashioned printer doesn't know What to do with fax and scan
	
	//so you can leave this method empty -> but you are still giving indication to user that he can do fax and scan with 
	//this old fashioned printer and it is following the machine interface.
	
	//or throw Exception like not implemented
	// now you need to add this exception to method signature which will propagate to interface itself.
	// And what if this interface is not in your control. or you don't own the source code of this machine.
	
	
	// therefore ISP comes into picture. -> have your interface with as minimum functions as possible.
	
	@Override
	public void fax(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan(Document d) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

}
