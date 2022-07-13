package Constructor;

public class UserDefineConstructor
{

	int a;
	int b;
	
	public  UserDefineConstructor()
	{
		a=450;
		b=320;
		
	}
	public static void main(String[] args)
	{
		// created an object
		UserDefineConstructor uc=new  UserDefineConstructor();
		uc.addition();
		uc.division();
				

	}
	public void addition()
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
    public void division()
    {
    	int div=a/b;
    	System.out.println("the division is "+div);
    }
}
