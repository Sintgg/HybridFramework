package listdemo;

import java.util.ArrayList;

public class ProductArray {
	
	public static void main(String[] args) {
		
		
		Product p1 = new Product("Kissan Jam", 1, "Mixed Fruit", 2023);
		Product p2 = new Product("Kissan Jam", 2, "Mango", 2022);
		Product p3 = new Product("Kissan Jam", 3, "Strawberry", 2020);
		Product p4 = new Product("Kissan Jam", 4, "Pineapple", 2021);
		Product p5 = new Product("Kissan Jam", 5, "Grape", 2023);
		
		ArrayList<Product> alp = new ArrayList<Product>();
		alp.add(p1);
		alp.add(p2);
		alp.add(p3);
		alp.add(p4);
		alp.add(p5);
		
		for (Product product : alp) {
			System.out.println(product.pName);
			System.out.println(product.pVersion);
			System.out.println(product.pManDate);
			System.out.println(product.pModel);
		}
	}

}
