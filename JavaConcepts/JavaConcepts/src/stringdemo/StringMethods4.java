package stringdemo;

public class StringMethods4 {

	public static void main(String[] args) {

		String a1 = "Selenium"; 
		String a2 = "Automaiton";
		String a3 = "selenium";

		// concat() - this method will concat two string
		System.out.println(a1.concat(a2));
		System.out.println(a1 + a2);
		
		// equals and equal ignore case
		System.out.println(a1.equals(a3));
		System.out.println(a1.equalsIgnoreCase(a3));
		
		// compare and compareTo
		// 1012100010-1012120100 = -32
		System.out.println(a1.compareTo(a3));

	}

}
