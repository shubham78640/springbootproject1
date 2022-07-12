package com.lastproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/product/details/{productid}")
	public Product getProductInfo(@PathVariable Long productid) {
		return new Product(productid,"mi", "new phone", 66, true);
		
	}
}
