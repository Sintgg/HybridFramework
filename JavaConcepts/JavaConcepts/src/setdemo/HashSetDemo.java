package setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// assume you are developing an application for user management
		
		Set<String> hs = new HashSet<String>();
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
