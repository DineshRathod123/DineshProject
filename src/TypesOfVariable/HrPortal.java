package TypesOfVariable;

public class HrPortal {

	public static void main(String[] args)
	{
		Employee BabarA=new Employee();
		BabarA.EmpName="Babar Azam";
		BabarA.Empid=56;
		BabarA.Empdept="Batting";
		BabarA.Empgrade='A';
		
		BabarA.emp_info();
		
		Employee ShaheenA=new Employee();
		ShaheenA.EmpName="Shaheen Afridi";
		ShaheenA.Empid=32;
		ShaheenA.Empdept="Bolling";
		ShaheenA.Empgrade='A';
		
		ShaheenA.emp_info();
		

	}

}
