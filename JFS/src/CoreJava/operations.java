package CoreJava;

public class operations {
	public static int addition(int a,int b)
	{
		return(a+b);
	}
	public static int subtraction(int a,int b)
	{
		return(a-b);
	}
	public static int multiplication(int a,int b)
	{
		return(a*b);
	}
	public static double division(double a,double b)
	{
		return(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int add=addition(5,6);
int sub=subtraction(10,6);
int mul=multiplication(5,6);
double div=division(12.2,6);
System.out.println("addition of two values "+add);
System.out.println("subtraction of two values "+sub);
System.out.println("multiplication of two values "+mul);
System.out.println("division of two values "+div);
	}

}
