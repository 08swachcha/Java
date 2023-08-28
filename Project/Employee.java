import java.util.Scanner;
public class Employee
{
	private String name;
    private	String empId;
	private double salary;
	public void setName(String name)
	{
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Employee Name: ");
	    String name=sin.next();
		this.name=name;
	}	
	public void setid(int empId)
	{
		Scanner sin=new Scanner(System.in);
		System.out.println("Input Employee NID: ");
	    String empId=sin.next();
		this.empId=empId;
	}	
	public void setSalary(double salary)
    {
		Scanner sin=new Scanner(System.in);
		System.out.println("Employee Salary: ");
	    double salary=sin.nextDouble();
		this.salary=salary;
	}	
	public String getName( )
	{
		return name;
	}	
	public String getNid( )
	{
		return empId;
	}
    public 	double getSalary( )
	{
		return salary;
	}	
}