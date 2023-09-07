package oopsinheritance;

public class TestPhone {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		iphone.makeCall();
		iphone.receiveCall();
		iphone.sendText();
		iphone.receiveText();
		
		System.out.println("******************");
		
		Iphone4 iphone4 = new Iphone4();
		iphone4.makeCall();
		iphone4.receiveCall();
		iphone4.sendText();
		iphone4.receiveText();
		iphone4.camera();
		iphone4.musicPlayer();
		
		System.out.println("******************");
		
		Iphone6 iphone6 = new Iphone6();
		iphone6.makeCall();
		iphone6.receiveCall();
		iphone6.sendText();
		iphone6.receiveText();
		iphone6.camera();
		iphone6.musicPlayer();
	}

}
