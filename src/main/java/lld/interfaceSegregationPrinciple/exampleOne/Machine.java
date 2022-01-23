package lld.interfaceSegregationPrinciple.exampleOne;

public interface Machine {

	void print(Document d);
	
	void fax(Document d);
	
	void scan(Document d) throws Exception;
	
}
