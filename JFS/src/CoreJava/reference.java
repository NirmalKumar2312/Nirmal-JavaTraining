package CoreJava;//without use static
import java.util.Scanner;
class reference1{
	public void id(String a,int b) {
		System.out.println("name"+a);
		System.out.println("age"+b);
	}
}
public class reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int var=sc.nextInt();
		reference1 obj=new reference1();
		obj.id(name,var);
		sc.close();
	}
}