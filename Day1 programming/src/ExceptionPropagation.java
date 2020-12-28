
public class ExceptionPropagation {
	void a()
	{
		int A=20/0;
	}
	void b()
	{
		a();	
	}
	void c()
	{
	try
	{
		a();
	}
	catch (Exception e)
	{
		System.out.println("In c");
	}
	}
	public static void main(String[] args) {
	ExceptionPropagation value = new ExceptionPropagation();
	value.c();
	}

}
