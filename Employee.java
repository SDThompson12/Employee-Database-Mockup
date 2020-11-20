public abstract class Employee 
{
	private String name;
	private String department;

	public void setName(String name) 
	{
		this.name = name;
		
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "\nEmployee Name: " + this.name + "\nDepartment: " + this.department;
	}
	
	public abstract double calculateWeeklyPay();
	
	public Employee(String name, String department) throws ImproperNameException
	{
		String[] properName = name.split(" ");
		if (properName.length != 2)
		{
			throw new ImproperNameException();
		}
		else
		{
			this.name = name;
		}	
		this.department = department;
	}
}