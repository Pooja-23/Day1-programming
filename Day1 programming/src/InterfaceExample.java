interface Bike
{
	float roi(float r);
}
class Sbi implements Bike
{
	public float roi(float r)
	{
		float p =2*r;
		return (p);
	}
}
public class InterfaceExample 
{

	public static void main(String[] args) 
	{
		Bike A = new Sbi();
		float u=A.roi(25.9f);
		System.out.println(u);

	}

}
