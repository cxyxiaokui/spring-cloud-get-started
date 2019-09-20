package cn.zhuoqianmingyue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvnController {
	@Value("${env}")
    private String env;
	
	@RequestMapping("/env")
    public String evn() {
        return this.env;
    }
}
