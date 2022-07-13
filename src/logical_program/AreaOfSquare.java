package logical_program;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args)
	{
		int side;
		int area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of side:");
		side=sc.nextInt();
		
		area=side*side;
		System.out.println("Area of square:"+area);
	
	}

}
