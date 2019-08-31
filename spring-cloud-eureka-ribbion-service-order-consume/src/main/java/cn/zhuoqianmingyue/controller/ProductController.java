package cn.zhuoqianmingyue.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/product/{id}")
	public String productInfo(@PathVariable(name="id")Long productId) {
		
		ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCTSERVER");
		URI uri = serviceInstance.getUri();
		String url = uri.toString()+"/product/"+productId;
		ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
		String message = forEntity.getBody();
		
		return message;
	}
}
