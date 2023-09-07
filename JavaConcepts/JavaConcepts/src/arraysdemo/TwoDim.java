package arraysdemo;

public class TwoDim {

	public static void main(String[] args) {

		String s[][] = new String[3][3];

		s[0][0] = "A0";
		s[0][1] = "B0";
		s[0][2] = "C0";

		s[1][0] = "A1";
		s[1][1] = "B1";
		s[1][2] = "C1";

		s[2][0] = "A2";
		s[2][1] = "B2";
		s[2][2] = "C2";

		// length method
		System.out.println("Row length : " + s.length);
		System.out.println("Col length : " + s[0].length); // to get the column length first we need mention name index

		System.out.println("**********************************");

		// Retrieve the value from 2D array
		System.out.println(s[2][0]);
		System.out.println(s[1][1]);
		System.out.println(s[0][2]);

		System.out.println("*********** Printing all the values ************");

		for (int i = 0; i < s.length; i++) 
		{
			for(int j =0; j <s[0].length; j++)
			{
				System.out.println(s[i][j]);
			}
		}
		
		System.out.println("*********** Printing all the advance for loop ************");
		
		for (String[] r : s) 
		{
			for (String c : r) 
			{
				System.out.println(c);
			}
		}
	}

}
