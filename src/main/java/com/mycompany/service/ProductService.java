package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Product;

public interface ProductService {
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product findProductById(Long productId);
	
	public Product findProductByProductName(String productName);
	
	public List<Product> findAllProducts();
	
	public void deleteProductById(Long productId);

}
