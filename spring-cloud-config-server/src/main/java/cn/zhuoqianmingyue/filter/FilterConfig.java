package cn.zhuoqianmingyue.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	 @Bean
	    public FilterRegistrationBean filterRegistration() {
	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new BusRefreshFilter());
	        List<String> urlList = new ArrayList<String>();
	        urlList.add("/*");
	        registration.setUrlPatterns(urlList);
	        registration.setName("BusRefreshFilter");
	        registration.setOrder(1);
	        return registration;
	    }
}
