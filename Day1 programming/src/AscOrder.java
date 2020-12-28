
public class AscOrder {

	public static void main(String[] args) 
	{
		int temp,i,n=9,j,r=0;
		
		int[] a ;
		int [] b;
		b = new int[6];
		a = new int[6];
		a[0]=1;
		a[1]=3;
		a[2]=3;
		a[3]=1;
		a[4]=1;
		a[5]=3;

		for(i=0;i<6;i++)
		{
			//if(i%2==0)
			//{
			for(j=i+1;j<6;j++)
			{
				if(a[i]==a[j]&& i!=n)
				{
					b[r]=a[i];
					r++;
					n=j;
					break;
				}
		
			}
			//}
			/*else 
			{
				for(j=i;j<6;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}*/
		}
		for(i=0;i<6;i++)
		{
			System.out.println(b[i]);
		}

	}

}
