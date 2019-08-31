package cn.zhuoqianmingyue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zhuoqianmingyue.interfaceApi.ProductClient;
import cn.zhuoqianmingyue.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductClient personClient;
	
	@RequestMapping("/product/{id}")
	public Product productInfo(@PathVariable(name="id")Long productId) {
		Product product = personClient.productInfo(productId);
		return product;
	}
}
