package com.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Entity.Product;
import com.Product.Repository.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {
		@Autowired
		private ProductRepo repo;
	@Override
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		return repo.save(p);
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Product getProduct(Integer id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).orElse(null);
	}

}
