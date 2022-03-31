package BookStore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PrintPage implements InitializingBean,DisposableBean{
	public void statement() {
		System.out.print("runned");
	}
	public void start() {
		System.out.println("start");
	}
	public void end() {
		System.out.println("end");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterProperties");
	}
}
