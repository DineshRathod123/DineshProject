package logical_program;

public class PrimeNumberSeries {

	public static void main(String[] args)
	{
		int n=50;
		int number=1,count=0;
		
		while(number<=n)
		{
			for(int i=1; i<=number; i++)
			{
				if(number%i==0)
				{
					count++;
				}
			}
			
			if(count==2)  // true if number is prime
			{
				System.out.println(" "+number);
				
			}
			
			count=0;   // reset count
			number++; // for checking next number
			
		 }
		
	}
		
}	

	


