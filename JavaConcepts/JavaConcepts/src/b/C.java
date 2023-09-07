package b;

import a.*;

public class C extends A {
	
	
	public static void main(String[] args) {
		
		A obja = new A();
		System.out.println(obja.c);
		
		C objc = new C();
		System.out.println(objc.c);
		System.out.println(objc.d);
		
	}

}
