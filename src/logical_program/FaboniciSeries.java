package logical_program;

public class FaboniciSeries {

	public static void main(String[] args)
	{
		// Fabonici series-----> 0+1=1, 1+1=2, 2+1=3, 2+3=5, 3+5=8 .......
		
		int a=0;
		int b=1;
		
		for(int x=0; x<=10; x++)
		{
			int c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}

	}

}
