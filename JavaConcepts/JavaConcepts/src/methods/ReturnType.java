package methods;

public class ReturnType {

	public static void main(String[] args) {
		
		int res = ReturnType.calSum(10, 10);
		System.out.println(res);
		
		String title = ReturnType.getPagetitle();
		if(title.contains("Page"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	public static int calSum(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public static String getPagetitle()
	{
		return "Title";
	}

}
