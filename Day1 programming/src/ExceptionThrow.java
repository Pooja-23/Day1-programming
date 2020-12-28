import java.util.*;
public class ExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
	
		age = sc.nextInt();
		if(age<20)
		{
			try {
			throw new ArithmeticException("not valid");
				}
			finally  (ArithmeticException e) {System.out.println("Not valid");}
			System.out.println("Next please!");
		}
		else {System.out.println("Proceed further");}
	}

}
