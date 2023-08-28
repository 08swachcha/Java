import java.util.Scanner;
public class FixedAccount extends Account
{
	private int tenureYear;
    public void setTenureYear(int tenureYear) 
    {
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Tenure Year: ");
	    int tenureYear=sin.nextInt();
		this.tenureYear=tenureYear;
	}	
	public int getTenureYear( )  
	{
		return tenureYear;
	}
	public void showInfo()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate);
		System.out.println();
	}
}