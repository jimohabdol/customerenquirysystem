package com.mycompany.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.model.Product;
import com.mycompany.repository.ProductRepository;
import com.mycompany.service.ProductService;

public class ProductServiceImplementation implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	@Override
	public Product addProduct(Product product) {
		Product newPro = null;
		try {
			newPro = productRepo.save(product);
		} catch (Exception e) {
			System.out.println("Error saving product: "+ e.getMessage());
		}
		return newPro;
	}

	@Override
	public Product updateProduct(Product product) {
		Product update = null;
		try {
			update = productRepo.save(product);
		} catch (Exception e) {
			System.out.println("Error update product: "+ e.getMessage());
		}
		return update;
	}

	@Override
	public Product findProductById(Long productId) {
		Product pro = null;
		try {
			pro = productRepo.getOne(productId);
		} catch (Exception e) {
			System.out.println("Error finding product: "+ e.getMessage());
		}
		return pro;
	}

	@Override
	public Product findProductByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> allProducts = new ArrayList<Product>();
		try {
			allProducts = productRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return allProducts;
	}

	@Override
	public void deleteProductById(Long productId) {
		try {
			productRepo.deleteById(productId);
		} catch (Exception e) {
			System.out.println("Error deleting product: " + e.getMessage());
			
		}
	}

}
