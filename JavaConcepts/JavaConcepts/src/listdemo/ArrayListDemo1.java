package listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(40);
		
		for (Integer alint : al) 
		{
			System.out.println(alint);
		}
		
		System.out.println("*******************************");
		
		ArrayList<String> als = new ArrayList<String>();
		als.add("Selenium");
		als.add("Appium");
		als.add("Java");
		als.add("Jira");
		als.add("Selenium");
		
		System.out.println(als);

	}

}
