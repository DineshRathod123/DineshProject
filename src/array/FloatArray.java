package array;

public class FloatArray {

	public static void main(String[] args)
	{
		// with using new keyword
		
		// method declaration
		
		float[] percentage=new float[4];
		
		// assign value
		
		percentage[0]=56.45f;
		percentage[1]=58.54f;
		percentage[2]=63.22f;
		percentage[3]=65.43f;
		
		// usage
		
		for( int i=0; i<=percentage.length-1; i++)
		{
			System.out.println(percentage[i]);
			
		}
		System.out.println("==================");
		
		// without using new keyword
		
		float[] per= {88.34f ,87.56f, 32.34f, 90.12f};
		
		for(int a=0; a<=per.length-1; a++)
		{
			System.out.println(per[a]);
		}
	

	}

}
