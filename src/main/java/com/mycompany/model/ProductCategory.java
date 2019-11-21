package com.mycompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_CATEGORY")
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productCatId;
	private String ProductCatName;
	private String ProductCatDescription;
	
	public ProductCategory(String productCatName, String productCatDescription) {
		super();
		ProductCatName = productCatName;
		ProductCatDescription = productCatDescription;
	}

	public long getProductCatId() {
		return productCatId;
	}

	public void setProductCatId(long productCatId) {
		this.productCatId = productCatId;
	}

	public String getProductCatName() {
		return ProductCatName;
	}

	public void setProductCatName(String productCatName) {
		ProductCatName = productCatName;
	}

	public String getProductCatDescription() {
		return ProductCatDescription;
	}

	public void setProductCatDescription(String productCatDescription) {
		ProductCatDescription = productCatDescription;
	}
		
}
