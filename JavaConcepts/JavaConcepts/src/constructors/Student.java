package constructors;

public class Student {
	
	String sname;
	int sid;
	String sdept;
	char sgen;
	boolean isStudentCurrent;
	
	public Student()
	{
		System.out.println("Student Constructor is Created");
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.sname = "aravind";
		s1.sid = 200;
		s1.sdept = "mechanical";
		s1.sgen = 'm';
		s1.isStudentCurrent = false;
		System.out.println(s1.sname+" "+s1.sid+" "+s1.sdept+" "+s1.sgen+" "+s1.isStudentCurrent);
		
		Student s2 = new Student();
		s2.sname = "pallavi";
		s2.sdept = "computer science";
		s2.sgen = 'f';
		s2.isStudentCurrent = true;
		System.out.println(s2.sname+" "+s2.sid+" "+s2.sdept+" "+s2.sgen+" "+s2.isStudentCurrent);

	}

}
