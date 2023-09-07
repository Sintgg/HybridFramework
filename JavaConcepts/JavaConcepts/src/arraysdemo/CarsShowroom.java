package arraysdemo;

public class CarsShowroom {

	public static void main(String[] args) {
		
		String cars[]= new String[5];
		cars[0] = "Audi";
		cars[1] = "BMW";
		cars[2] = "Honda";
		cars[3] = "Toyata";
		cars[4] = "Nissan";
		cars[1] = "Porshe";
		
		System.out.println("******************************");
		
		System.out.println(cars[1]);
		System.out.println(cars[4]);
		
		System.out.println("******************************");
		
		for (String carmake : cars) 
		{
			System.out.println(carmake);
		}

	}

}
