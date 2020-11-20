public class SalariedEmployee extends Employee
{
	private double yearlySalary;

	public double getYearlySalary()
	{
		return this.yearlySalary;
	}
	
	public void setYearlySalary(double yearlySalary)
	{
		this.yearlySalary = yearlySalary;
	}
	
	public double calculateWeeklyPay()
	{
		return (yearlySalary/52);
	}
	
	public String toString()
	{
		return super.toString() + "\nYearly Wage: " +  String.format("%.2f",yearlySalary) + "\n";
	}
	
	public SalariedEmployee (String name, String department, double yearlySalary) throws ImproperNameException
	{
		super(name,department);
		this.yearlySalary = yearlySalary;
	}
	
}