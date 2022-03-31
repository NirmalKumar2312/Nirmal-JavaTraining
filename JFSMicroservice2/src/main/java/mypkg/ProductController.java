package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {
	@GetMapping("/product")
    public String product() {
 	   return "Welcome to product information Page";
    }
	
}
