package OfficeDetails;
import java.util.Scanner;
import General.*;

public class AboutOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);//scanner function
		System.out.println("ENTER YOUR WORKTIMEING");
		int time=s.nextInt();
		System.out.println("ENTER YOUR ADDRESS");
		String address=s.next();
		System.out.println("ENTER YOUR WORKLOCATION");
		System.out.println("1=chennai,2=trichy,3=mumbai,4=delhi");
		int location=s.nextInt();
		System.out.println("----------------");
		OtherDetails a=new OtherDetails();
		a.OfficeDetails(time,address,location);
		
	}

}
