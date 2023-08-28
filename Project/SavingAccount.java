import java.util.Scanner;
public class SavingsAccount extends Account
{
	private double interestRate ;
    public void setInterestRate(double interestRate)
    {
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Interest Rate: ");
	    double interestRate=sin.nextDouble();
		this.interestRate=interestRate;
	}	
	public double getInterestRate( ) 
	{
		return interestRate;
	}
	public void showInfo()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate);
		System.out.println();
	}
}