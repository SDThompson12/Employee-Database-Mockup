import java.util.Scanner;
import java.io.*;
public class EmployeeDriver
{
	public static void main(String[] args) throws ImproperNameException, IOException
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What is the name of your company?\n");
		String companyName = input.nextLine();
		
		System.out.print("\nWhere is your company located?\n\n");
		System.out.print("Street: ");
		String companyStreet = input.nextLine();
		System.out.print("\nCity: ");
		String companyCity = input.nextLine();
		System.out.print("\nState: ");
		String companyState = input.nextLine();
		System.out.print("\nZip Code: ");
		String companyZipCode = input.nextLine();
		
		Company info = new Company((companyName),new Address(companyStreet, companyCity, companyState, companyZipCode));
		System.out.print(info + "\n\nPlease enter information of employees who work here.\n");
		info.addEmployee();
		info.addEmployee();
		info.filedEmployees();
		readFiles();
	}
	public static void readFiles() throws FileNotFoundException
	
	{
		File insideFile = new File("This_Company_Employees.txt");
		Scanner reader = new Scanner(insideFile);
		if(insideFile.exists())
		{
			while(reader.hasNext())
			{
				String line = reader.nextLine();
				System.out.println(line);
			}
		}
		else
		{
			System.out.println("The file is nonexistent.");
		}
	}
}