 import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Choice: ");
	    int x=sin.nextInt();
		
		/*switch(x)
		{
			if(x==1)
			{
				Scanner sin=new Scanner(System.in);
		        System.out.println("Input Choice: ");
	            int y=sin.nextInt();
				{
					switch(y)
					{
						if(y==1)
						{
							
						}
					}
				}
			}
		}*/
		
		Customer c1=new Customer();
		c1.setName();
		c1.setNid();
		c1.setNid();
		
		Employee e1=new Employee();
		e1.setName();
		e1.setid();
		e1.setSalary();
		
		FixedAccount f1=new FixedAccount();
		f1.setTenureYear();
		
		SavingsAccount s1=new SavingsAccount();
		s1.setInterestRate();
		
		

}
