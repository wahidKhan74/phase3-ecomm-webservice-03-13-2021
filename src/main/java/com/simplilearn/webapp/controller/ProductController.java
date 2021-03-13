package com.simplilearn.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.webapp.model.Product;

@RestController
public class ProductController {

	List<Product> products = new ArrayList<Product>();

	private List<Product> getDefaultProduct() {
		products.add(new Product(1001, "Iphone 11 Pro", "It is a smart phone", 70000));
		products.add(new Product(1002, "Lenovo Laptop XYZ series", "It is a Laptop", 20000));
		products.add(new Product(1003, "Ferari", "It is a racing car", 280000));
		products.add(new Product(1004, "Dimond Ring", "It is a ring", 230000));
		return products;
	}

	// Product CRUD Operations

	// get all products
	@GetMapping("/products") // or @RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> getAllProducts() {
		return getDefaultProduct();
	}

	// get one product by id
	@GetMapping("/products/{id}") // or @RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product getOneProduct(@PathVariable("id") int id) {
		// enhanced for loop.
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	// get one product by name
	@GetMapping("/product") // or @RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product getOneProductByName(@PathParam("name") String name) {
		// enhanced for loop.
		for (Product product : products) {
			if (name.equals(product.getName())) {
				return product;
			}
		}
		return null;
	}

	// add a product
	@PostMapping("/products")
	public List<Product> addProduct(@RequestBody Product product) {
		products.add(product);
		return products;
	}

	// update one product by id
	@PutMapping("/products") // 
	public List<Product> updateOneProduct(@RequestBody Product product) {
		// counter for loop
		for (int i=0; i<products.size(); i++) {
			if (products.get(i).getId() == product.getId()) {
				products.set(i, product);
				return products;
			}
		}
		return null;
	}
	
	// delete one product
	@DeleteMapping("/products/{id}") // 
	public List<Product> removeOneProduct(@PathVariable("id") int id) {
		// counter for loop
		for (int i=0; i<products.size(); i++) {
			if (products.get(i).getId() == id) {
				products.remove(i);
				return products;
			}
		}
		return null;
	}
}
