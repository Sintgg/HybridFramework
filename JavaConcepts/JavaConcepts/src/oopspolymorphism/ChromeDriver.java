package oopspolymorphism;

public class ChromeDriver implements WebDriver {
	
	public void chromeMenuStyle() {
		System.out.println("Chrome Menu");
	}
	
	public void chromeBrowserColor() {
		System.out.println("Chrome Color");
	}

	public void chromeFileDownload() {
		System.out.println("Downloading a File from Chrome Browser");
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
