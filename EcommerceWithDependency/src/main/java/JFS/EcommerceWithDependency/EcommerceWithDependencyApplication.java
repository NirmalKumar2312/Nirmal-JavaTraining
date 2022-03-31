package JFS.EcommerceWithDependency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceWithDependencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceWithDependencyApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext context) {
//	return atgs->{
//	String[] beanNames=context.getBeanDefinitionNames();
//	System.out.println("Lets see The Beans:");
//	for(String b:beanNames) {
//		System.out.println(b);
//		}
//	};

//	}
}
