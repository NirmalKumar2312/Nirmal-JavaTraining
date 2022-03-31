package CoreJava;

import java.util.Scanner;

public class work1 {
	public static int loops(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)//n=10//0+1+2+3+4+5+6+7+8+9+10=55
		{
			sum=sum+i;
		}
		return(sum);
	}
	public static void relation(int a)
	{
	if(a>=18)
	{
	    System.out.println("It is eligable to get licence");
	}
	    else
	{
	    System.out.println("It is not eligable to get licence");
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sa=new Scanner(System.in);
		
		System.out.println("DETAILS");
		
		System.out.println("NAME");
		String name=sa.nextLine();
		System.out.println("AGE");
		int age=sa.nextInt();
		System.out.println("DEGREE");
		String degree=sa.nextLine();
		details s1=new details();
		s1.name="ram";
		s1.age=22;
		s1.degree="b.tech";
		details s=new details(name,age,degree);
		System.out.println("----------");
		workerProfile obj=new workerProfile();
		obj.about(s);
		sa.close();
		//System.out.println();
		//System.out.println("--------------");
		//System.out.println("ELIGABLE FOR LICENCE");
		//relation(19);
		//relation(17);
		//System.out.println();
		//System.out.println("--------------");
		//System.out.println("USEING FOR LOOP");
		//int result=loops(10);
		//System.out.println(result);


	}

}
