package Loops;

public class ForLoopPractice {

	public static void main(String[] args) 
	{
		for( int i=3; i>=0; i--)
		{
			for(int b=0; b<i; b++)
			{
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
		   System.out.println("=======");
		   
		   for(int x=1; x<=8; x++)
		   {
			   for(int y=1; y<=x; y++)
			   {
				   System.out.print("* ");
				   
			   }
			   System.out.println(" ");
		   }
		   
		   System.out.println("==============");
		   
		   for(int p=8; p>=0; p--)
		   {
			   for(int q=0; q<p; q++)
			   {
				   System.out.print("* ");
			   }
			   System.out.println(" ");
		   }
		   
		   System.out.println("==============");
		   
		   for(int a=5; a>=0; a--)
		   {
			   for(int b=0; b<a; b++)
			   {
				   System.out.print("* ");
			   }
			   System.out.println(" ");
		   }
		   
		   System.out.println("============");
		  
		   for(int a=1; a<=5; a++)
		   {
			   for(int l=5; l>=a; l--)
			   {
				   System.out.print(" ");
			   }
			   for(int l=1; l<=a; l++)
			   {
				   System.out.print("* ");
			   }
			   System.out.println();
		   }
		   

	}

}
