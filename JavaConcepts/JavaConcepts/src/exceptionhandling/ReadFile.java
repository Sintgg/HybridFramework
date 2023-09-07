package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

 // Throwable --> Exception --> IOException --> FilenotFoundException

public class ReadFile {

	public static void main(String[] args)   {
		
		File file = new File("D:\\WORKSPACE\\BATCH24\\JavaConcepts\\src\\exceptionhandling\\testdata.txt");
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(file);
			fis.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		

	}

}
