package cn.zhuoqianmingyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigProductServiceApplication.class, args);
	}

}
