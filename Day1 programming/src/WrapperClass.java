public class WrapperClass
{
static double salary = 1000;

public static void main(String args[]) {
double salary = 2000;
System.out.println("Inside salary:" + salary);
test();
}
public static void test (){
System.out.println("Outside salary:" + salary);
}
}


