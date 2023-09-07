package methods;

public class Calculator {
	
	public static void main(String[] args) {
		
		Calculator.calSum(10, 10);
		Calculator.calSub(10, 5);
		Calculator.calMul(10, 10);
		Calculator.calDiv(10, 2);
		Calculator.calMod(3, 2);
		System.out.println("*****************");
		
		Calculator.calSum(10, 10, 10);
		Calculator.calSum(10, 10);
	}
		
	public static void calSum(int num1, int num2)
	{
		int sum = num1+num2;
		System.out.println("Sum of given numbers : "+sum);
	}
	
	public static void calSum(int num1, int num2, int num3)
	{
		int sum = num1+num2+num3;
		System.out.println("Sum of given numbers : "+sum);
	}
	
	public static void calSub(int num1, int num2)
	{
		int sub = num1-num2;
		System.out.println("Sub of given numbers : "+sub);
	}
	
	public static void calMul(int num1, int num2)
	{
		int mul = num1*num2;
		System.out.println("Mul of given numbers : "+mul);
	}
	
	public static void calDiv(int num1, int num2)
	{
		int div = num1/num2;
		System.out.println("Div of given numbers : "+div);
	}
	
	public static void calMod(int num1, int num2)
	{
		int mod = num1%num2;
		System.out.println("Mod of given numbers : "+mod);
	}

}
