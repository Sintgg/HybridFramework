package arraysdemo;

public class Trainer {

	public static void main(String[] args) {
		
		Object trainer[]=new Object[5];
		trainer[0] = "Shantosh";
		trainer[1] = 'M';
		trainer[2] = true;
		trainer[3] = 20.33;
		trainer[4] = 998610421;
		
		for (Object t1 : trainer) {
			System.out.println(t1);
		}
		
	}
}
