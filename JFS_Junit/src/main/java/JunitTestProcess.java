import java.util.Scanner;

public class JunitTestProcess {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Value");
		int num1=sc.nextInt();
		System.out.println("Enter the second- Value");
		int num2=sc.nextInt();
		Calculator obj=new Calculator();
		System.out.println(obj.add(num1,num2));
		

	}

}
