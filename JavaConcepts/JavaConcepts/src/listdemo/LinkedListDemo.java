package listdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> al = new LinkedList<Integer>();
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
		
		List<String> als = new LinkedList<String>();
		als.add("Selenium");
		als.add("Appium");
		als.add("Java");
		als.add("Jira");
		als.add("Selenium");
		
		System.out.println(als);

	}

}
