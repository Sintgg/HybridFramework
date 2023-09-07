package arraysdemo;

public class ArrayProgram {

	public static void main(String[] args) {
		
		// declare int type array with size 10
		
		int num[] = new int[10];
		num[0] = 10; // index starts from 0 -- lower bound of an array
		num[1] = 20;
		num[2] = 35;
		num[3] = 30;
		num[4] = 42;
		num[5] = 88;
		num[6] = 90;
		num[7] = 45;
		num[8] = 37;
		num[9] = 22; // size - 1 (10-1=9) 9 is called as upper bound of an array
		
		System.out.println("***************************");
		
		System.out.println("size of the given array : "+num.length);
		
		System.out.println("***********retriving the value based on index***********");
		System.out.println(num[0]);
		System.out.println(num[9]);
//		System.out.println(num[10]);
		
		System.out.println("*********** printing the values using advance for loop ***********");
		
		for (int numvalues : num) 
		{
			System.out.println(numvalues);
		}
		
		System.out.println("*********** printing the values using regular for loop ***********");
		
		for(int i=0; i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
	}

}





