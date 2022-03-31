package JFS.BookShopApp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogInfoClass {
	

	@Before(value="execution(public void displayMyBook()")
	public void beforeDisplayMyBook() {
		System.out.println("Log info: Method is insideMyBook");
		System.out.println("Log info: Method name is displayMyBook");
	}
	@After(value="execution(public void displayMYBook())")
	public void AfterdisplayMyBook() {
		System.out.println("After My Book");
	}
	@org.aspectj.lang.annotation.AfterReturning(value="execution(public Integer artistCount()",returning="artist")
	public void AfterReturning() {
	System.out.println("Log Info:After ReturningArtistCount");
	}
	@Pointcut("execution(* MyBook.displayMyBook(..))")
	public void pointcut() {
		
	}
	@Around("pointcut()")
	public void Aroundptcut() {
		System.out.println("Log Info:Around Annotation");
	}
	@Before(value="execution(public void thriller())")
	public void BeforeDisplaythriller() {
		System.out.println("Log info :Display before Thriller");
	}
}
