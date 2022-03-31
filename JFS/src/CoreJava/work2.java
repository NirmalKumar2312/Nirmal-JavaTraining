package CoreJava;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sa=new Scanner(System.in);
details[] id=new details[4];
workerProfile obj=new workerProfile();
		System.out.println("DETAILS");
		
		System.out.println("NAME");
		String name=sa.nextLine();
		System.out.println("AGE");
		Integer age=sa.nextInt();
		System.out.println("DEGREE");
		String degree=sa.next();
		id[0]=new details();
		id[0].name="ram";
		id[0].age=22;
		id[0].degree="b.tech";
		id[1]=new details(name,age,degree);
		id[2]=new details("sam",25,"m.tech");
		id[3]=new details("vis",23,"b.e");
		System.out.println("----------");
		for(int i=0;i<4;i++)
		{
			obj.about(id[i]);
		}
		
		
		sa.close();

	}

}
