package methods;

public class Calculator2 {
	
	public static void main(String[] args) {
		
		Calculator2 cal2 = new Calculator2();
		cal2.calSum(10, 10);
		cal2.calSub(10, 5);
		cal2.calMul(10, 10);
		cal2.calDiv(10, 2);
		cal2.calMod(3, 2);
		
	}
		
	public void calSum(int num1, int num2)
	{
		int sum = num1+num2;
		System.out.println("Sum of given numbers : "+sum);
	}
	
	public void calSub(int num1, int num2)
	{
		int sub = num1-num2;
		System.out.println("Sub of given numbers : "+sub);
	}
	
	public void calMul(int num1, int num2)
	{
		int mul = num1*num2;
		System.out.println("Mul of given numbers : "+mul);
	}
	
	public void calDiv(int num1, int num2)
	{
		int div = num1/num2;
		System.out.println("Div of given numbers : "+div);
	}
	
	public void calMod(int num1, int num2)
	{
		int mod = num1%num2;
		System.out.println("Mod of given numbers : "+mod);
	}

}
