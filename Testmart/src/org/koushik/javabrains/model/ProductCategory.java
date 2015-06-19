package org.koushik.javabrains.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product_category database table.
 * 
 */
@Entity
@Table(name="product_category")
@NamedQuery(name="ProductCategory.findAll", query="SELECT p FROM ProductCategory p")
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductCategoryPK id;

	public ProductCategory() {
	}

	public ProductCategoryPK getId() {
		return this.id;
	}

	public void setId(ProductCategoryPK id) {
		this.id = id;
	}

}