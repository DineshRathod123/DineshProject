package logical_program;

import java.util.Scanner;

public class EvenAndOddNumbers {

	public static void main(String[] args) 
	{
		int x;
		
		// create an object of scanner
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		x=sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
	}

}
