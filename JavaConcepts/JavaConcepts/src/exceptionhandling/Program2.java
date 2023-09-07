package exceptionhandling;

public class Program2 {

	public static void main(String[] args)   {
		
		System.out.println("** Program Started **");
		System.out.println("** Line 1 got executed **");
		System.out.println("** Line 2 got executed **");
		System.out.println("** Line 3 got executed **");
		System.out.println("** Line 4 got executed **");
		System.out.println("** Line 5 got executed **");
		
		int a = 10;
		int b = 0;
		System.out.println("Trying to divide a number by 0");
		try
		{
			int c = a/b;
			System.out.println(c);	
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
			System.out.println("garbage collected");
		}
		System.out.println("** Line 6 got executed **");
		System.out.println("** Line 7 got executed **");
		System.out.println("** Line 8 got executed **");
		System.out.println("** Line 9 got executed **");
		System.out.println("** Line 10 got executed **");
		System.out.println("** Program Ended **");
		
		
	}

}
