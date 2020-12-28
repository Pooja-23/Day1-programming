 class Employee 
{
 String name;
	float salary;
	Employee(){}
	Employee(String n)
	{
		name=n;
	}
	public void print()
{
	System.out.println("Employee name : "+name);
	System.out.println("Employee salary : "+salary);
	
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Employee one = new Employee("POOJA N");
System.out.println("hello");

Inherit three = new Inherit();

one.salary=5600;
one.print();
three.work();
three.show();
	}
}
 interface West
 {
	 int x=5,y=8;
	 void show();
	 
 }

 interface  NameOf
{
	 
	 void work();

}
 class  Inherit implements NameOf,West
 {
 	 
 	 public void work()
 	
 	 {
 		 System.out.println(x+y+" "+"interface changed" );
 	 }
 	public void show()
 	
	 {
		 System.out.println("interface1s");
	 }
 	
 }

 

