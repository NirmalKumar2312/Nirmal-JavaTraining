package General;

public class OtherDetails
{
	String hobbies;
	String skills;
public OtherDetails(){
}
public OtherDetails(String a,String b)//constructor without argument
{
	this.hobbies=a;
	this.skills=b;
	System.out.println("HOBBIES :"+hobbies);
	System.out.println("SKILLS :"+skills);
}
public void OfficeDetails(int a,String b,int c)
{
	System.out.println("TIME:"+a);
	if(a<=4) {
		System.out.println("SALARY :8000");
	}
	else if(a<8) {
		System.out.println("SALARY :14000");
	}
	else {
		System.out.println("SALARY :20000");
	}
	
	System.out.println("ADDRESS :"+b);
	switch(c) {
	case 1:
		System.out.println("LOCATION :CHENNAI");
		break;
	case 2:
		System.out.println("LOCATION :TRICHY");
		break;
	case 3:
		System.out.println("LOCATION :MUMBAI");
		break;
	case 4:
	System.out.println("LOCATION :DELHI");
	break;
	
	}
}
}
