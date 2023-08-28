import java.util.Scanner;
public class Customer implements AccountOperations
{
	private String name;
    private	int nid ;
	private Account[ ] accounts;
	private int totalCount=0;
    public	void setName(String name)
    {
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Customer Name: ");
	    String name=sin.next();
		this.name=name;
	}	
	public void setNid(int nid)
	{
		Scanner sin=new Scanner(System.in);
		System.out.println("Input NID Account: ");
	    int nid=sin.nextInt();
		this.nid=nid;
	}	
	public String getName( )
    {
		return name;
	}
	public int getNid( )
	{
		return nid;
	}	
	public void insertAccount(Account a)
	{
		if(totalCount<accounts.length)
		{
			accounts[totalCount]=a;
			totalCount++;
		}
		else
		{
			System.out.println("Not possible ....");
		}
	}
	public void removeAccount(Account a)
	{
		for(int i;i<totalCount;i++)
		{ 
	        if(accounts[i]==a)
			{
			accounts[i]=accounts[--totalCount];
		    }
		else
		{
			System.out.ptintln("Not found");
		}
	}
	
	public void showAllAccounts()
	{
		for(int i=0;i<totalCount;i++)
		{
			accounts[i].showInfo();
		}
	}	
		
}
