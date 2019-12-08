package cn.zhuoqianmingyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulServiceApplication.class, args);
	}

}
