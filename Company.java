import java.util.*;
import java.io.*;

public class Company 
{
	//Attributes
	private ArrayList <Employee> employeeList = new ArrayList <Employee>();
	private String name;
	private Address placeOfBusiness;
	
	//Contructor that creates an object of the Address class within it's class
	public Company (String name, String street, String city, String state, String zipcode)
	{
		this.name = name;
		this.placeOfBusiness = new Address(street, city, state, zipcode);
	}
	
	//Copy Contructor that uses the object to call the other Copy Contructor of the Address Class
	public Company (String name, Address placeOfBusiness)
	{
		this.name = name;
		this.placeOfBusiness = new Address(placeOfBusiness);
	}
	
	//Overriding toString
	public String toString()
	{
		return "\nCompany's Name: " + this.name + "\n\n" + "Company's Address: " + this.placeOfBusiness;
	}
	
	//Method for Hourly or Salaried
	public void addEmployee() 
	{		
		Scanner input = new Scanner(System.in);
		System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~\nEmployee's Name (Please add space between First and Last Name and at the end of the Last Name): ");
		String employeeName = input.nextLine();
		System.out.print("\nDepartment of Work: ");
		String employeeDepartment = input.nextLine();
		System.out.print("\nIs the hired employee (Salaried or Hourly?): ");
		String typeOfEmployee = input.nextLine();
		if (typeOfEmployee.equalsIgnoreCase("Salaried"))
		{
			System.out.print("\nWhat is " + employeeName + "'s salary: ");
			double yearlyWage = input.nextDouble();
			try
			{
				SalariedEmployee newEmployee = new SalariedEmployee(employeeName,employeeDepartment, yearlyWage);
				this.employeeList.add(newEmployee);
			}
			catch (ImproperNameException ine)
			{
				System.out.print(ine.getMessage());
			}
			
		}
		else if (typeOfEmployee.equalsIgnoreCase("Hourly"))
		{
			System.out.print("\nWhat is " + employeeName + "'s hourly pay: ");
			double wage = input.nextDouble();
			System.out.print("\nPlease input the hours worked this week	: \n");
			int tooMuchTime = input.nextInt();
			try
			{
				HourlyEmployee hiredEmployee = new HourlyEmployee(employeeName, employeeDepartment, wage, tooMuchTime);
				this.employeeList.add(hiredEmployee);
			}
			catch (ImproperNameException ine)
			{
				System.out.print(ine.getMessage());
			}
		
		}
		else
		{
			System.out.print("Invalid Hiring Input." + "\n");
		}
	}
	
	//Method for Weekly Pay Report
	public void filedEmployees() throws IOException
	{
			for(Employee worker: employeeList)
				{
					FileWriter output = new FileWriter("This_Company_Employees.txt", true);
					PrintWriter writer = new PrintWriter(output);
					writer.print(worker.toString());
					output.close();
				}
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	public Address getAddress()
	{
		return new Address(placeOfBusiness);
	}
	
	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(Address placeOfBusiness)
	{
		this.placeOfBusiness = new Address(placeOfBusiness);
	}
	
	
}