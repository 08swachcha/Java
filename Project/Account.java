import java.util.Scanner;
public abstract class Account implements ITransactions
{
	protected int accountNumber;
    protected double balance;
    public void setAccountNumber(int accountNumber);
	{
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Account Number: ");
	    int accountNumber=sin.nextInt();
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance)
	{		
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Balance: ");
	    double balance=sin.nextDouble();
		this.balance=balance;
	}
    public int getAccountNumber( )
	{
		return accountNumber;
	}
    public double getBalance( )
	{
		return balance;
	}
	public void deposit(double amount){
		if(amount>0){
			this.balance +=amount;
			System.out.println("Balance:"+this.balance);
		}else{
			System.out.println("Invalid Deposit");
			
		}
	}
	public void withdraw(double amount){
		if(balance>=amount && amount>0){
			this.balance -=amount; 
			System.out.println("Balance:"+this.balance);
		}else{
			System.out.println("Invalid Withdraw");
		
		}
	}
	public void transfer(Account a,double amount){
		if(this.withdraw(amount)){
			rec.deposit(amount);
		}else{	
			System.out.println("Invalid Transfer");
		}		
	}

    public abstract void showInfo( );
}