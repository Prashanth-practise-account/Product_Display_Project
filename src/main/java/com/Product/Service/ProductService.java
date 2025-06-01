package com.Product.Service;

import java.util.List;

import com.Product.Entity.Product;

public interface ProductService {
		Product	saveProduct(Product p);
		List<Product> getAllProducts();
		void deleteProduct(Integer id);
		Product getProduct(Integer id);
}
