package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JfsRibbonImplementationApplication {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/load-balancing")
	public String callService() {
		return restTemplate.getForObject("http://jfs-ribbon-app/app",String.class);
	}

	@Bean
	@LoadBalanced
	public RestTemplate createTemplate(){
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(JfsRibbonImplementationApplication.class, args);
	}

}