package constructors;

public class Student2 {
	
	String sname;
	int sid;
	String sdept;
	char sgen;
	boolean isStudentCurrent;
	
	// this is the keyword which is used to map the global variables with local parameters
	
	public Student2(String name, int sid) 
	{
		this.sname=name;
		this.sid=sid;
		System.out.println(name+" "+sid);
	}
	
	
	public Student2(String name, int sid, String sdept, char sgen, boolean isStudentCurrent)
	{
		this.sname=name;
		this.sid=sid;
		this.sdept=sdept;
		this.sgen=sgen;
		this.isStudentCurrent=isStudentCurrent;
		System.out.println("Details of the Student ");
		System.out.println(name+" "+sid+" "+sdept+" "+sgen+" "+isStudentCurrent);
		System.out.println("*****************************");
	}

	public static void main(String[] args) {
		
		Student2 s1 = new Student2("pallavi", 101, "electronics", 'f', true);
		Student2 s2 = new Student2("alka", 102, "computer", 'f', true);
		Student2 s3 = new Student2("pooja", 103, "biotech", 'f', true);
		
		Student2 s4 = new Student2("ashwin", 202);
	}

}
