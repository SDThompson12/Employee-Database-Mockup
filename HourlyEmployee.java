public class HourlyEmployee extends Employee
{
	private double hourlyWage;
	private int hoursWorked;
	
	public double getHourlyWage()
	{
		return this.hourlyWage;
	}
	
	public void setHourlyWage(double hourlyWage)
	{
		this.hourlyWage = hourlyWage;
	}
	
	public int getHoursWorked()
	{
		return this.hoursWorked;
	}
	
	public void setHoursWorked(int hours)
	{
		hoursWorked = hours;
	}
	
	public double calculateWeeklyPay()
	{
		return hoursWorked * hourlyWage;
	}
	
	public String toString()
	{
		return "\n" + super.toString() + "\nHourly Wage: " +  String.format("%.2f",hourlyWage) + "\n";
	}
	
	public HourlyEmployee(String name, String department, double wage,int hours) throws ImproperNameException
	{
		super(name,department);
		this.hourlyWage = wage;
		hoursWorked = hours;
	}

}