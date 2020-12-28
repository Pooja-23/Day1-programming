class ATest
{
	void first()
	{
		System.out.println("Parent class");
	}

}
class BTest extends ATest
{
	void second()
	{
		System.out.println("child class");
		}
}

class PracticeJava 
 {
	 public static void  main(String[] args) 
	{
		BTest a= new BTest();
		a.first();
		a.second();
	}
 }


