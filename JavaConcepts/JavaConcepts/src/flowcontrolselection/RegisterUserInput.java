package flowcontrolselection;

import java.util.Scanner;

public class RegisterUserInput {

	public static void main(String[] args) {
		
		System.out.println("Please enter your age");
		
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt(); // 10
		
		if(age >= 18)
		{
			System.out.println("Allow the User to Register");
		}
		else
		{
			System.out.println("Sorry Kid! Your did not met the Criteria");
		}
		
		scan.close();

	}

}
