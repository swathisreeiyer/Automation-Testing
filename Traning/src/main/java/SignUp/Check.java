package SignUp;

public class Check {
	public void name(String str)
	{
		if(str.equals("john"))
		{
			System.out.println("TestCase Passed");
		}
		else
			System.out.println("TestCase Failed");
	}
	public void surname(String sur)
	{
		if(sur.equals("Smith"))
		{
			System.out.println("TestCase Passed");
		}
		else
			System.out.println("TestCase Failed");
	}
	public void dob(String bday)
	{
		if(bday.equals("2002-18-07"))
		{
			System.out.println("TestCase Passed");
		}
		else
			System.out.println("TestCase Failed");
	}
	public void number(int n)
	{
		if(n==738222391)
		{
			System.out.println("TestCase Passed");
		}
		else
			System.out.println("TestCase Failed");
	}
	

}
