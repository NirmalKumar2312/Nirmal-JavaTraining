package CoreJava;



public class details {
	String name;
    Integer age;
	String degree;
	details(){
		
	}
details(String a,int b,String c)
	{
	this.name=a;
	this.age=b;
	this.degree=c;
	System.out.println(name);
	System.out.println(age);
	System.out.println(degree);
	
	}
details(String a,int b)
{
this.name=a;
this.age=b;
System.out.println(name);
System.out.println(age);
}
@Override
public String toString() {
	return "details [name=" + name + ", age=" + age + ", degree=" + degree + "]";
}

}
