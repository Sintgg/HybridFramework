package mapcollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(404, "Page Not Found");
		hm.put(501, "Resource not avaiable");
		hm.put(200, "OK");
		hm.put(201, "Created");
		hm.put(204, "Deleted");
		hm.put(404, "Page");
		hm.put(401, "Unautorized");
		hm.put(500, "Internal Server Error");
		hm.put(400, "OK OK");
		
		System.out.println(hm);
		
		System.out.println(hm.get(404));
		
		System.out.println("****************************");
		
		for ( Entry<Integer, String> e : hm.entrySet()) 
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println("****************************");
		
		for (Integer keys: hm.keySet()) 
		{
			System.out.println(keys);
		}
		
	}

}
