package com.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Product.Entity.Product;
import com.Product.Service.ProductService;

@Controller
public class ProductController {
		@Autowired
		ProductService ser;
		@GetMapping("/")
		public String form()
		{
			return "AddProduct";
		}
		
		@PostMapping("/save")
		public String saveProduct(@ModelAttribute Product p)
		{
			ser.saveProduct(p);
			return "redirect:/all";
		}
		@GetMapping("/all")
		public String allProducts(Model model)
		{
			model.addAttribute("products",ser.getAllProducts());
			return "AllProducts";
		}
		@GetMapping("/delete/{id}")
		public String DeleteProduct(@PathVariable Integer id)
		{
			ser.deleteProduct(id);
			return "redirect:/all";
		}
		@GetMapping("/edit/{id}")
		public String EditProduct(@PathVariable Integer id , Model model)
		{
			model.addAttribute("data",ser.getProduct(id));
			return "EditPage";
		}
}
