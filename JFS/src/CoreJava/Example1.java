package CoreJava;

public class Example1{
public void error(String a) throws ExceptionLast
{
	
if(a.length()==5) {
	
	throw new ExceptionLast("you value is ok");
}
else
{
	throw new ExceptionLast("you value is not ok");
}
}
}