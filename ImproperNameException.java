public class ImproperNameException extends Exception
	{
		public ImproperNameException()
		{
			super("The name you entered must have a first and a last name.\n");
		}
		public ImproperNameException(String message)
		{	
			super(message);	
		}
	}