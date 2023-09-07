package flowcontrolselection;

public class SwitchBreak {

	public static void main(String[] args) {
		
		int num = 10;
		
		switch(num)
		{
		case 1:
			System.out.println("Case 1 got printed");
//			break;
		case 2:
			System.out.println("Case 2 got printed");
//			break;
		case 3:
			System.out.println("Case 3 got printed");
//			break;
		case 4:
			System.out.println("Case 4 got printed");
			break;
		case 5:
			System.out.println("Case 5 got printed");
			break;
			default:
				System.out.println("None of the case label is matching");
		}

	}

}
