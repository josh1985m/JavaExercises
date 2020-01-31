import java.util.*;
public class ExceptionAssignment //This is a pretty cool app but I can't get the throw 
{									//messages to print?
	public static class MyException extends Exception
	{
		public MyException(String message) 
		{
	        super(message);
	    }
	}
	public static class DivideByZero extends Exception
	{
		public DivideByZero(String message) 
		{
	        super(message);
	    }
	}
	public static class CheckAnswer 
	{
		public CheckAnswer(int numerator, int denominator) throws MyException, DivideByZero
		{
			if (numerator == 0 | denominator == 0)
			{
				throw new DivideByZero("Cannot divide by zero!");
			}
			if (numerator % denominator != 0) 
			{
				throw new MyException(numerator + "/" + denominator + "Has a remainder!");
			}
			else
			{
				System.out.println(numerator + "/" + denominator + " = " + numerator/denominator);
			}
		}
	}
	public static void main(String[] args) throws MyException, DivideByZero {
		
		for (int i = 1; i < 11; i++)
		{
			for (int j = 1; j < 11; j++)
			{
				try
				{
				CheckAnswer ca = new CheckAnswer(i, j);
				}
				catch (MyException e)
				{
					
				}
				catch (DivideByZero e)
				{
					
				}
			}
		}

	}

}
