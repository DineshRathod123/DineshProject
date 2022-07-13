package logical_program;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int no=11;
		int count=0;
		
		for(int i=4; i<=no-1; i++)
		{
			if(no%i==0)
			{
				count=count+1;
				
			}
		}
		if(count>0)
		{
			System.out.println("not prime number");
		}
		else
		{
			System.out.println("no is prime");
		}

	}

}
