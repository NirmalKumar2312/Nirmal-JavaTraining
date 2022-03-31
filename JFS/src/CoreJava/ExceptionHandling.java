package CoreJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e=new Example1();
		try {
			
			e.error("mhj");
		}
		
		catch(ExceptionLast msg)
		{
			System.out.print(msg);
		}
	}

}
