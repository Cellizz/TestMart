package org.koushik.javabrains.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductJPAOperations {

	private Product product;


	public void save(Product product){
		
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Testmart");
 
		/* Create and populate Entity */
		this.product = product;
				/* Create EntityManager */
		EntityManager em = emf.createEntityManager();
 
		this.product = new Product();
		this.product.setId(0);
		this.product.setName(product.getName());
		this.product.setPrice(product.getPrice());
		this.product.setSku(product.getSku());
		
		/* Persist entity */
		em.getTransaction().begin();
		em.persist(this.product);
		em.getTransaction().commit();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
