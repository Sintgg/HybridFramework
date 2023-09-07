package stringdemo;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		
		// length()
		int len = str1.length();
		System.out.println("length of a given string : "+len);
		System.out.println(str1.length());
		
		String str2 = " Kate Winslet is my all time Fav Crush ";
		// trim()
		System.out.println(str2);
		System.out.println(str2.trim());
		
		String str3 = "james bond";
		// toUpperCase();
		System.out.println(str3.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		String str4 = "TITANIC";
		// toLowerCase
		System.out.println(str4.toLowerCase());
		System.out.println(str2.trim().toUpperCase());
	}

}
