package product;

import java.util.Scanner;

public class productDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		productBaseInfo obj=new productBaseInfo();
		productBaseInfo a[]=new productBaseInfo[4];
		a[0]=new productBaseInfo(1,"nokia",10000,"black");
		a[1]=new productBaseInfo(2,"one plus",25000,"blue");
		a[2]=new productBaseInfo(3,"redmi",12000,"white");
		a[3]=new productBaseInfo(4,"realme",8000,"red");
		onlineShoping b=new onlineShoping();
		for(int i=0;i<4;i++)
		{
		b.productDetails(a[i]);
		}
		
		s.close();
		}

}
