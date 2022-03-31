package General;

public class Basics {
	public static void details(String a,String b,String c,String d,int e) {
		System.out.println("NAME :"+a);
		System.out.println("DATE :"+b);
		System.out.println("DEGREE :"+c);
		System.out.println("DEPORTMENT :"+d);
		System.out.println("AGE :"+e);
		
	}
	public static void detail(String a,String b) {
		OtherDetails con=new OtherDetails(a,b);//constructor connected to method
	}

}
