public class Bank implements CustomerOperations,EmployeeOperations
{
	private Customer[ ] customers;
	private Employee[ ] employees;
    private int totalCount=0;
	public void insertCustomer(Customer c)
	{
		if(totalCount<customers.length)
		{
			customers[totalCount]=c;
			totalCount++;
		}
		else
		{
			System.out.println("Not possible ....");
		}
	}
	public void removeCustomer(Customer c)
	{
		for(int i;i<totalCount;i++)
		{   
	        if(customers[i]==c)
			{
			customers[i]=customers[-totalCount];
		    }
		else
		{
			System.out.ptintln("Not found");
		}

	}
	public void showAllCustomers()
	{
		
		for(int i=0;i<totalCount;i++)
		
			{
				System.out.println("**********************************");
				System.out.println("Customer Name: "+ c.getName());
				System.out.println("Customer Nid: "+ c.getNid());
				System.out.println("----------------------------------");
				//c.showAllAccounts();
				System.out.println("----------------------------------");
				System.out.println();
			}
		}
	}
	public void insertEmployee(Employee e)
	{
		if(totalCount<employees.length)
		{
			employees[totalCount]=e;
			totalCount++;
		}
		else
		{
			System.out.println("Not possible ....");
		}
	}
	public void removeEmployee(Employee e)
	{
		for(int i=0;i<totalCount;i++)
		{
			if(employees[i]==e)
			{
			employees[i]=employees[--totalCount];
			}
		else
		{
			System.out.ptintln("Not found");
		}

	}
	public void showAllEmployees()
	{
		System.out.println("/////////////////////////////////");
	
		for(int i=0;i<totalCount;i++)
		{		
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("/////////////////////////////////");
	}
}