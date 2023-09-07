package loops;

public class PrintOddNumbers {

	// print only odd numbers between 50 to 75

	public static void main(String[] args) {

		for (int i = 50; i <= 75; i++) 
		{
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
