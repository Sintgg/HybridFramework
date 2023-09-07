package loops;

public class ReversePrintEven {
	
	// print only even numbers between 10 to 1

	public static void main(String[] args) {
		
		for(int i=10; i>=1; i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
