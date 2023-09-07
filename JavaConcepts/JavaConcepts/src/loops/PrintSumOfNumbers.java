package loops;

public class PrintSumOfNumbers {
	
	// print sum of first 5 numbers 5+4+3+2+1

	public static void main(String[] args) {
		
		int res = 0;
		
		for(int i=1; i<=5; i++)
		{
			res = res+i;
		}
		
		System.out.println(res);

	}

}
