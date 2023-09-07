package stringdemo;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s1 = "Shantosh";
		String s3 = "shantosh";
		String s2 = "Shantosh";
		String s4 = "Shantosh";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s3.hashCode());
	}

}
