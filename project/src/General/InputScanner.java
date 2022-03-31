package General;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class InputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);//scanner function
		System.out.println("ENTER YOUT NAME");
		String name=s.nextLine();
		System.out.println("ENTER YOUT DOB");
		String date=s.nextLine();
		System.out.println("ENTER YOUT DEGREE");
		String degree=s.next();
		System.out.println("ENTER YOUT DEPORTMENT");
		String deportment=s.next();
		System.out.println("ENTER YOUT AGE");
		int age=s.nextInt();
		System.out.println("ENTER YOUT HOBBIES");
		String hobbies=s.next();
		System.out.println("ENTER YOUT SKILLS");
		String skills=s.next();
		System.out.println("------------------");
		Basics a=new Basics();//method calling
		a.details(name,date,degree,deportment,age);//method display
		a.detail(hobbies,skills);//give the value to the constructor
		s.close();
	}

}

