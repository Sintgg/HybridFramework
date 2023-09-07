package stringdemo;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String str1 = " Learning Java is Good Fun Lots of Confusion";
		
		// method chaining
		int size = str1.trim().toUpperCase().length();
		System.out.println(size);
		
		// charAt(index) - this method going to retrieve the character present at the given index
		char c = str1.charAt(1);
		System.out.println(c);
		
		// replace('oldchar','newchar'), replaceAll() - replaces the char with another char or sequence of char
		String replacedstring = str1.replace('L', 'l');
		System.out.println(replacedstring);
		System.out.println(str1.trim().replace('L', 'l'));
		
		String replacedstring1 = str1.replaceAll("Confusion", "Intresting");
		System.out.println(replacedstring1);

	}

}
