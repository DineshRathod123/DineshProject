package logical_program;

public class StarProgram {

	public static void main(String[] args) 
	{
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
		System.out.println("===============");
		
		for(int k=6; k>=0; k--)
		{
			for(int l=0; l<k; l++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
		System.out.println("===============");
		
		for( int p=0; p<=6; p++)
		{
			for(int q=6; q>=p; q--)
			{
				System.out.print(" ");
			}
			for(int q=0; q<=p; q++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
		System.out.println("===============");
		
		int a=5;
		
		for(int x=1; x<=a; x++)
		{
			for(int y=1; y<=a; y++)
			{
				if(x==y||x+y==a+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	 }
		
 }
		

	


