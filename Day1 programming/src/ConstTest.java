 class StudentInfo
	{
	 int rollno;
	 String name;
	 String college = "REC";
	 StudentInfo(int a,String b)
	 {
		 rollno=a;
		 name=b;
	 }
	 void display()
	 {
		 System.out.println(rollno+" "+name+" "+college);
	 }
	}

public class ConstTest {

	public static void main(String[] args) 
	{
		StudentInfo s1;
		s1 = new StudentInfo(21,"Pooja");
		StudentInfo s2= new StudentInfo(21,"Pooja");
		StudentInfo s3= new StudentInfo(21,"Pooja");
		StudentInfo s4= new StudentInfo(21,"Pooja");
		StudentInfo s5= new StudentInfo(21,"Pooja");
		StudentInfo s6= new StudentInfo(21,"Pooja");
	    s1.display();
	    s2.display();s3.display();s4.display();s5.display();s6.display();
	}

}
