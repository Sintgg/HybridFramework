package oopspolymorphism;

public class TestApplication {

	public static void main(String[] args) {
		
		System.out.println("************** Compiletime Polymorphism **********");
		
		ChromeDriver driver = new ChromeDriver();
		driver.chromeFileDownload();
		driver.chromeBrowserColor();
		driver.chromeMenuStyle();
		driver.maximise();
		driver.get("https://www.google.com/");
		driver.sendKeys("Shantosh Automation");
		driver.select();
		driver.click();
		driver.getPageTitle();
		driver.close();
		
		System.out.println("************** Runtime Polymorphism **********");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.maximise();
		driver1.get("https://www.google.com/");
		driver1.sendKeys("Shantosh Automation");
		driver1.select();
		driver1.click();
		driver1.getPageTitle();
		driver1.close();
		

	}

}
