package cn.zhuoqianmingyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zhuoqianmingyue.model.Product;

@RestController
public class ProductController {
	
	@GetMapping("/product/{id}")
	public Product productInfo(@PathVariable(name="id")Long productId) {
		Product product = new Product();
		product.setId(productId);
		product.setName("product 1:"+"苹果");
		product.setPrice(12d);
		return product;
	}
}
