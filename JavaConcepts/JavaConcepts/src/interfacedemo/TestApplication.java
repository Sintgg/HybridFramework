package interfacedemo;

public class TestApplication {

	public static void main(String[] args) {
		
		System.out.println("************** Testing the Application with Chrome Driver **********");
		
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
		
		System.out.println("************** Testing the Application with Firefox Driver **********");
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.downloadFile();
		driver1.menuStyleFirefox();
		driver1.maximise();
		driver1.get("https://www.yahoosearch.com/");
		driver1.sendKeys("Shantosh Automation");
		driver1.select();
		driver1.click();
		driver1.getPageTitle();
		driver1.close();
		

	}

}
