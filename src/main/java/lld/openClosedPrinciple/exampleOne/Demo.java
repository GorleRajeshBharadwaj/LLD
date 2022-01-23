package lld.openClosedPrinciple.exampleOne;

import java.util.ArrayList;
import java.util.List;

import lld.openClosedPrinciple.exampleOne.specification.AndSpecification;
import lld.openClosedPrinciple.exampleOne.specification.BestFilter;
import lld.openClosedPrinciple.exampleOne.specification.ColorSpecification;
import lld.openClosedPrinciple.exampleOne.specification.SizeSpecification;

public class Demo {
	
	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("tree", Color.GREEN, Size.LARGE);
		Product house = new Product("house", Color.RED, Size.LARGE);
		
		List<Product> products = new ArrayList<>();
		products.add(apple);
		products.add(house);
		products.add(tree);
		
		ProductFilter pf = new ProductFilter();
		System.out.println("Green Products (old) : ");
		pf.filterByColor(products, Color.GREEN).forEach(prod -> System.out.println(" - " + prod.getName() + " is green"));
		
		BestFilter bf = new BestFilter();
		System.out.println("Geen prodcuts (new) : ");
		bf.filter(products, new ColorSpecification(Color.GREEN))
		        .forEach(prod -> System.out.println(" - "+ prod.getName()+ " is green"));
		
		System.out.println("Large blue items (new) : ");
		bf.filter(products, new AndSpecification<Product>(
				new ColorSpecification(Color.RED),
				new SizeSpecification(Size.LARGE)))
		        .forEach(prod -> System.out.println(" - "+ prod.getName()+ " is large and blue"));
	}

}
