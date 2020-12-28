abstract class Bank
{
	Bank()
	{
	System.out.println("In abstract class");
	}
	abstract void number();
	void display()
	{
		
	}
}
 class Syndicate extends Bank
{
	void number ()
	{
		System.out.println("In Syndicate  class");
	}
	void display()
	{
		System.out.println("in Syndicate bank");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank account1 = new Syndicate();
account1.display();
	}

}
