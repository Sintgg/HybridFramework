package operators;

public class Logical {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// & and | or  ^ ex-or
		
		// & both the values should be true for & output to be true
		
		System.out.println(true && true);  // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println("***************************");
		
		// I anyone should be true
		
		System.out.println(true | true);  // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false

		System.out.println("***************************");
		
		// ex-or its reverse of or if both are same then the result will be false
		
		System.out.println(true ^ true);  // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
		
	}

}
