package cn.zhuoqianmingyue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/product/{id}")
	public String productInfo(@PathVariable(name="id")Long productId) {
		
		String url = "http://PRODUCTSERVER/product/"+productId;
		ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
		String message = forEntity.getBody();
		
		return message;
	}
}
