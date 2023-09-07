package setdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeHashSetDemo {

	public static void main(String[] args) {
		
		// assume you are developing an application for user management
		
		Set<String> hs = new TreeSet<String>();
		hs.add("ramu@testmail.com");
		hs.add("shamu@testmail.com");
		hs.add("raju@testmail.com");
		hs.add("prabhu@testmail.com");
		hs.add("raju@testmail.com");
		hs.add("ramu@testmail.com");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
	}

}
