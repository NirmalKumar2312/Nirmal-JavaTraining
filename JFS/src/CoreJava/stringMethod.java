package CoreJava;
import java.util.Scanner;
class buffer{
	public void strn() {
		StringBuffer str1=new StringBuffer("HELLO");
		System.out.println(str1);
		System.out.println(str1.reverse());//REVERSE
		System.out.println(str1.append("WORLD"));//APPEND
		System.out.println(str1.insert(5, "false"));//insert
		System.out.println(str1.replace(5, 10,"true"));//replace
		System.out.println(str1.delete(5,9));//delete
	}
	public void strnc(String a) {
		System.out.println(a.length());
		System.out.println(a.charAt(1));
	}
}
public class stringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buffer b=new buffer();
		b.strn();
		Scanner some=new Scanner(System.in);
		String a=some.nextLine();
		b.strnc(a);
		char e=some.next().charAt(5);
		String f=String.valueOf(e);
		System.out.println(f);
		b.strnc(f);
		some.close();
	}

}
