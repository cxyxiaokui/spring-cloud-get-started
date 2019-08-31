package cn.zhuoqianmingyue.interfaceApi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.zhuoqianmingyue.model.Product;

@FeignClient(name="PRODUCTSERVER")
public interface ProductClient {
	
	@GetMapping("/product/{id}")
	public Product productInfo(@PathVariable(name="id")Long productId);
}
