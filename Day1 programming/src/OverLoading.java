class Example
{
	void sum(int a, int b) {
		System.out.println("A");
	}
	float sum(int a, int b)
			{
		System.out.println("B");
		return (a+b);
			}
}
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example w = new Example();
w.sum(21,34);
	}

}
