package stringdemo;

public class StringMethods3 {

	public static void main(String[] args) {
		
		String title = "selenium - Google Search";
		
		// contains --> it will check the partial availability
		
		boolean result = title.contains("Google");
		System.out.println(result);
		
		// substring
		String substring1 = title.substring(11);
		System.out.println(substring1);
		
		// begin index is inclusive last index is exclusive
		String substring2 = title.substring(11, 16);
		System.out.println(substring2);
		
		String str = "Selenium with Core Java";
		// split - split the given string based on some regex
		String[] words = str.split(" ");
		for (String letters : words) {
			System.out.println(letters);
		}
		
		String str1 = "a e i o u";
		String[] ch = str1.split(" ");
		for (String c : ch) {
			System.out.println(c);
		}

	}

}
