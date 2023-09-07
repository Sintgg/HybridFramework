package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;


 // (throws) Throwable --> Exception --> IOException --> FilenotFoundException

public class ReadFile2 {

	public static void main(String[] args)   {
		
		File file = new File("D:\\WORKSPACE\\BATCH24\\JavaConcepts\\src\\exceptionhandling\\testdata.txt");
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(file);
			fis.close();
			System.out.println("file reading was successfull");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block got executed");
		}

	}

}
