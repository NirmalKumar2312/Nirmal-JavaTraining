package arrayMethod;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add[]=new int[5];
		int even[]=new int[5];
		int prime[]= {2,3,5,7,11};
		
		Scanner s=new Scanner(System.in);
		add[0]=1;
		add[1]=3;
		add[2]=5;
		add[3]=7;
		add[4]=9;
		for(int i=0;i<add.length;i++) 
		{
		System.out.print(add[i] );
		}
		for(int i=0;i<even.length;i++)
		{
			even[i]=s.nextInt();
		}
		for(int i=0;i<even.length;i++) 
		{
		System.out.print(even[i] );
		}
		System.out.println();
		
		for(int i=0;i<=prime.length;i++) 
		{
			System.out.print(prime[i]);
			}
		for(int i=1;i<=100;i++) {
			int count=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0) {
							count++;
						}
					}
					if(count==2&&count==1) {
							System.out.println(prime[i]);
							
						}
					}
	}
		
}
