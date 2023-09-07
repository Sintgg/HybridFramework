package variables;

public class Batch24S {
	
	String sname;
	int id;
	char gender;
	static String institute = "H2K";

	public static void main(String[] args) {
		
		Batch24S s1 = new Batch24S();
		s1.sname = "pallavi";
		s1.id = 101;
		s1.gender = 'F';
		System.out.println(s1.sname);
		System.out.println(s1.id);
		System.out.println(s1.gender);
		System.out.println(Batch24S.institute);
		System.out.println("**********************************");
		
		Batch24S s2 = new Batch24S();
		s2.sname = "Angel";
		s2.id = 102;
		s2.gender = 'F';
		System.out.println(s2.sname);
		System.out.println(s2.id);
		System.out.println(s2.gender);
		System.out.println(Batch24S.institute);
		System.out.println("**********************************");

	}

}
