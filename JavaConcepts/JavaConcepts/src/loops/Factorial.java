package loops;

public class Factorial {
	
	// print factorial for number 5 5*4*3*2*1 = 120

	public static void main(String[] args) {
		
		int res = 1;
		
		for(int i=1; i<=5; i++)
		{
			res = res*i;
		}
		
		System.out.println(res);

	}

}
