package array;

public class BooleanArray {

	public static void main(String[] args)
	{
		// with new keyword
		
		// method declaration
		
		boolean[] output= new boolean[5];
		
		output[0]=true;
		output[1]=false;
		output[2]=true;
		output[3]=false;
		
		for(int x=0; x<=output.length-1; x++)
		{
			System.out.println(output[x]);
		}
		
		System.out.println("===================");

		// without new keyword
		
		 boolean[] condition={true, false, true, false, true};
		 
		 for(int y=0; y<=condition.length-1; y++)
		 {
			 System.out.println(condition[y]);
		 }
	}

}
