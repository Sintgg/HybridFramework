package interfacedemo;

public class FirefoxDriver implements WebDriver {
	
	public void menuStyleFirefox() {
		System.out.println("Firefox Menu");
	}
	
	public void downloadFile() {
		System.out.println("Downloading File from Firefox Browser");
	}

	public void maximise() {
		System.out.println("Maximse the Browser");	
	}

	
	public void get(String url) {
		System.out.println("URL Entered" +url);
	}

	
	public void sendKeys(String text) {
		System.out.println("Text Entered" +text);	
	}

	
	public void click() {
		System.out.println("Clicked on the Element");
		
	}
	
	public void getPageTitle() {
		System.out.println("Got the Page Title");
		
	}

	
	public void close() {
		System.out.println("Closing the Browser");	
	}


	public void select() {
		System.out.println("Selecting the Option");
	}


}
