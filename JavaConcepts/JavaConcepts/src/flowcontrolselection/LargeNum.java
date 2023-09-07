package flowcontrolselection;

public class LargeNum {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 250;
		int c = 40;
		
		if(a>b & a>c)
		{
			System.out.println(a+ "a is largest");
		}
		else if(b>c & b>a)
		{
			System.out.println(b+ "b is largest");
		}
		else if(c>a & c>b)
		{
			System.out.println(c+ "c is largest");
		}
	}

}
