package listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		// add() which is used to add the objects to the collection
		al.add("selenium");
		al.add(101);
		al.add(true);
		al.add("appium");
		al.add("selenium");
		al.add("selenium");
		al.add("selenium");
		al.add("selenium");
		al.add("sql");
		al.add(22.33);
		al.add(66.66F);
		al.add('A');
		al.add("sql injection virus");
		
		// size() this method used to get the current size of the objects in the collection
		
		System.out.println(al.size());
		
		System.out.println("**************************");
		
		System.out.println(al);
		
		System.out.println("**************************");
		
		System.out.println(al.get(0));
		System.out.println(al.get(8));
		
		System.out.println("**************************");
		
		al.remove(0);
		
		System.out.println(al);
		
		System.out.println("**************************");
		
		al.add(0, "Selenium");
		
		System.out.println(al);
		
		System.out.println("**********iterator************");
		
		Iterator alo = al.iterator();
		while(alo.hasNext())
		{
			Object o = alo.next();
			System.out.println(o);
		}
		
		System.out.println("********for loop**********");
		
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("**********printing using advance forloop**********");
		
		for(Object ao:al)
		{
			System.out.println(ao);
		}

	}

}
