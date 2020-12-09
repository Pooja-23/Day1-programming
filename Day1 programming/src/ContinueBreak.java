import java.lang.module.*;
public class ContinueBreak {

	public static void main(String[] args) {
		int var1;
		System.out.println("Break useage");
		for (var1=0;var1<=5;var1++)
		{
			if(var1==3)
				break;
			System.out.println(var1);	
		}
		System.out.println("Continue useage");
		for (var1=0;var1<=5;var1++)
		{
			if(var1==3)
				continue;
			System.out.println(var1);	
		}
		
		// TODO Auto-generated method stub

	}

}
