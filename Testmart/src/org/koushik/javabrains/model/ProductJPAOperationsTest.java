package org.koushik.javabrains.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ProductJPAOperationsTest {

	@Test
	public void testSave() {
		
		ProductJPAOperations  pjpa = new ProductJPAOperations();
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("New book", "1234", 5.99));
		productList.add(new Product("Other book", "ABC", 15.99));
		for (Iterator iterator = productList.iterator(); iterator.hasNext();) {
			pjpa.save((Product) iterator.next());
			
		}
		pjpa.save(new Product("New book", "1234", 5.99));
		
	}

}
