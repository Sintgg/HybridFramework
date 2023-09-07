package oopspolymorphism;



public class TestApplication1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.out.println("************** Testing the Application with Chrome Driver **********");
		
		driver = new ChromeDriver();

		driver.maximise();
		driver.get("https://www.google.com/");
		driver.sendKeys("Shantosh Automation");
		driver.select();
		driver.click();
		driver.getPageTitle();
		driver.close();
		
		System.out.println("************** Testing the Application with Firefox Driver **********");
		
		driver = new FirefoxDriver();

		driver.maximise();
		driver.get("https://www.yahoosearch.com/");
		driver.sendKeys("Shantosh Automation");
		driver.select();
		driver.click();
		driver.getPageTitle();
		driver.close();
		

	}

}
