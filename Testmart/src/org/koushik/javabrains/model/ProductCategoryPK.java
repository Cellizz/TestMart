package org.koushik.javabrains.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the product_category database table.
 * 
 */
@Embeddable
public class ProductCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="category_id", insertable=false, updatable=false)
	private int categoryId;

	@Column(name="product_id", insertable=false, updatable=false)
	private int productId;

	public ProductCategoryPK() {
	}
	public int getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductCategoryPK)) {
			return false;
		}
		ProductCategoryPK castOther = (ProductCategoryPK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.productId == castOther.productId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.categoryId;
		hash = hash * prime + this.productId;
		
		return hash;
	}
}