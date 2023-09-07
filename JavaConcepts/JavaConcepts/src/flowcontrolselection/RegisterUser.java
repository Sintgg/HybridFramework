package flowcontrolselection;

public class RegisterUser {

	public static void main(String[] args) {
		
		int age = 16;
		
		if(age >= 18)
		{
			System.out.println("Allow the User to Register");
		}
		else
		{
			System.out.println("Sorry Kid! Your did not met the Criteria");
		}

	}

}
